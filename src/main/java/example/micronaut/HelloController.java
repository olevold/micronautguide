package example.micronaut;

import io.micronaut.context.event.ApplicationEventPublisher;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;

@Controller("/hello")
public class HelloController {
    @Inject
    ForecastBean forecastBean;

    @Inject
    ApplicationEventPublisher eventPublisher;

    @Inject
    Counter counter;

    @Get("/{jalla}")
    @Produces(MediaType.TEXT_PLAIN)
    public String index(HttpRequest<?> request, @PathVariable String jalla) {
        eventPublisher.publishEvent("666");
        return forecastBean.latestForecast() + " ---- " + counter.value();
    }
}