package example.micronaut;

import io.micronaut.context.annotation.Replaces;
import io.micronaut.runtime.http.scope.RequestScope;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequestScope
@Replaces(RealForecastBean.class)
public class TestForecastBean  implements ForecastBean {
    private String forecast;

    @PostConstruct
    public void init() {
        System.out.println("bean init " + this.hashCode());
        forecast = "test " + new SimpleDateFormat("dd/MMM/yy HH:mm:ss.SSS").format(new Date());
    }

    public String latestForecast() {
        return forecast;
    }
}
