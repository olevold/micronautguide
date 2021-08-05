package example.micronaut;

import io.micronaut.context.annotation.Secondary;
import io.micronaut.runtime.http.scope.RequestScope;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequestScope
@Secondary
public class OtherForecastBean implements ForecastBean {
    private String forecast;

    @PostConstruct
    public void init() {
        System.out.println("bean init " + this.hashCode());
        forecast = "uveir " + new SimpleDateFormat("dd/MMM/yy HH:mm:ss.SSS").format(new Date());
    }

    public String latestForecast() {
        return forecast;
    }
}
