package example.micronaut;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
public class HelloControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void testHello() {
        HttpRequest<String> request = HttpRequest.GET("/hello/bla");
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertTrue(body.startsWith("test"));
    }
}