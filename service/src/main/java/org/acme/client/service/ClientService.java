package org.acme.client.service;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import org.acme.client.dto.ClientEntityDTO;
import org.acme.client.dto.ClientMapper;
import org.acme.client.model.ClientEntity;
import org.acme.client.repository.ClientRepository;

@ApplicationScoped
public class ClientService {

    @Inject
    ClientRepository clientRepository;

    public String getCompanyName() {
        return "Catapan S/A";
    }

    public List<ClientEntityDTO> listAll() {
        return clientRepository.findAll()
            .stream()
            .map(ClientMapper.getInstance()::toDTO)
            .collect(toList());
    }

    public String getNameById(Long id) {
        Optional<ClientEntity> clientEntity = ClientEntity.findByIdOptional(id);

        if (clientEntity.isEmpty()) {
            throw new NotFoundException();
        }

        ClientEntity client = clientEntity.get();
        return client.getName();
    }
}
