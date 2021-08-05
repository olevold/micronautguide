package example.micronaut;

import io.micronaut.runtime.http.scope.RequestScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequestScope
public class RealForecastBean implements ForecastBean {
    private String forecast;

    @PostConstruct
    public void init() {
        System.out.println("bean init " + this.hashCode());
        forecast = "Scattered Clouds " + new SimpleDateFormat("dd/MMM/yy HH:mm:ss.SSS").format(new Date());
    }

    public String latestForecast() {
        return forecast;
    }

    @PreDestroy
    public void destroy() {
        System.out.println("bye!");
    }
}
