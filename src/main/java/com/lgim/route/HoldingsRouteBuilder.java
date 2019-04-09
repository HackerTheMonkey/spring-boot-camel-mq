package com.lgim.route;

import com.lgim.eai.platform.common.route.EAIDefaultInternalAMQRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HoldingsRouteBuilder extends EAIDefaultInternalAMQRouteBuilder {
    @Override
    public void configure() {
        from("activemq:queue:holdings")
                .routeId("queue:icis:data-load-service:holdings")
                .to("activemq:queue:holdings_processed");
    }
}
