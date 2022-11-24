package com.example.demo2.service.impl;

import com.example.demo2.entity.Client;
import com.example.demo2.repo.ClientRepository;
import com.example.demo2.service.ClientService;


import java.util.List;

public class ClientServiceImpl implements ClientService {
    private ClientRepository clientRepository;

   public ClientServiceImpl(com.example.demo2.repo.ClientRepository clientRepository) {
        super();
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getallclients() {
        return clientRepository.findAll();
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
}
