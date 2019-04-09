package com.lgim.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TransactionsRouteBuilder extends RouteBuilder {
    @Override
    public void configure() {
        from("activemq:queue:transactions")
                .routeId("queue:icis:data-load-service:transactions")
                .to("activemq:queue:transactions_processed");
    }
}
