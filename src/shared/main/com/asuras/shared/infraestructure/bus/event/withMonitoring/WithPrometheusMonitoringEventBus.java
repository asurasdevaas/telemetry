package com.asuras.shared.infraestructure.bus.event.withMonitoring;

import com.asuras.shared.domain.bus.event.DomainEvent;
import com.asuras.shared.domain.bus.event.EventBus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Primary
@Service
@Qualifier("SpringApplicationEventBus")
public class WithPrometheusMonitoringEventBus  implements EventBus {

    private final EventBus eventBus;


    public WithPrometheusMonitoringEventBus(EventBus eventBus)
    {
        this.eventBus = eventBus;

    }

    public void registerEventDomainCounter(DomainEvent event)
    {
        System.out.println(event.toPrimitives().entrySet()
                .stream()
                .filter(entry -> entry.getValue() instanceof String)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }


    public void publish(final List<DomainEvent> events) {
        //register in monitoring

        events.forEach(this::registerEventDomainCounter);

        eventBus.publish(events);

    }


}
