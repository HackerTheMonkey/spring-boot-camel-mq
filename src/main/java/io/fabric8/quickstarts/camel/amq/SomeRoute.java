package io.fabric8.quickstarts.camel.amq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SomeRoute extends RouteBuilder {
    @Override
    public void configure() {
        from("file:///Users/joseph/tmp/CAMEL?move=.done")
                .to("file:///Users/joseph/tmp/CAMEL_PROCESSED?autoCreate=true");
    }
}
