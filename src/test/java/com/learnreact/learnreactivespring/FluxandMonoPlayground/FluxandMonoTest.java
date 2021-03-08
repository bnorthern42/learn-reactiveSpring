package com.learnreact.learnreactivespring.FluxandMonoPlayground;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FluxandMonoTest {
    @Test
    public void fluxtest(){


       Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring");

       stringFlux
               .subscribe(System.out::println);
    }
}
