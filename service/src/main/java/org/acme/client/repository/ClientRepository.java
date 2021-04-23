package org.acme.client.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;
import org.acme.client.model.ClientEntity;

@ApplicationScoped
public class ClientRepository implements PanacheRepository<ClientEntity> {

}
