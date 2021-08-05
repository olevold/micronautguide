package example.micronaut;

import io.micronaut.context.event.ApplicationEventListener;

import javax.inject.Singleton;
import java.util.concurrent.atomic.AtomicInteger;

@Singleton
public class Counter implements ApplicationEventListener<String> {
    AtomicInteger counter = new AtomicInteger();

    @Override
    public void onApplicationEvent(String event) {
        System.out.println("counter value: " + counter.intValue());
        counter.incrementAndGet();
    }

    @Override
    public boolean supports(String event) {
        return event.equals("666");
    }

    public int value() {
        return counter.intValue();
    }
}
