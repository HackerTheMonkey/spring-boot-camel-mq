package com.lgim.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PricesRouteBuilder extends RouteBuilder {
    @Override
    public void configure() {
        from("activemq:queue:prices")
                .routeId("queue:icis:data-load-service:prices")
                .to("activemq:queue:prices_processed");
    }
}
