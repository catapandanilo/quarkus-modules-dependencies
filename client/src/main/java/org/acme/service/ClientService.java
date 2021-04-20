package org.acme.service;

import io.quarkus.runtime.StartupEvent;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class ClientService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientService.class);

    void startup(@Observes StartupEvent startupEvent) {
        LOGGER.info("********************* passou no startup main **********");
    }
}
