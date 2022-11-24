package com.example.demo2.service;
import com.example.demo2.entity.Client;

import java.util.List;

public interface ClientService{
   List<Client> getallclients();

   Client saveClient(Client client);

   Client getClientById(Long id);

   Client updateClient (Client Client);

   void  deleteClientById (Long id);
}








