package com.lgim.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PortfoliosRouteBuilder extends RouteBuilder {
    @Override
    public void configure() {
        from("activemq:queue:portfolios")
                .routeId("queue:icis:data-load-service:portfolios")
                .to("activemq:queue:portfolios_processed");
    }
}
