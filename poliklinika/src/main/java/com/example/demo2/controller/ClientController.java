package com.example.demo2.controller;

import com.example.demo2.entity.Client;
import com.example.demo2.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ClientController{

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        super();
        this.clientService =  clientService;

    }
    @GetMapping("/clients")
    public String listClients (Model model){
        model.addAttribute("clients",clientService.getallclients());
        return "clients";

    }
    @GetMapping("/clients/new")
    public String createClientForm (Model model){
        Client client=new Client();
        model.addAttribute("client",client);
        return "create_client";

    }
    @PostMapping("/clients")
    public String saveClient (@ModelAttribute("client")Client client){
        clientService.saveClient(client);
        return "redirect:/client";
    }
    @GetMapping("/clients/edit/{id}")
    public String editClientForm (@PathVariable Long id, Model model) {
        model.addAttribute("client", clientService.getClientById(id));
        return "edit_client";


    }

   
    @PostMapping("/clients/{id}")
    public String updateClient(@PathVariable Long id, @ModelAttribute("client") Client client, Model model){
        Client existingClient =  clientService.getClientById(id);
        existingClient.setId(id);
        existingClient.setFirstname(client.getFirstname());
        existingClient.setLastname(client.getLastname());
        existingClient.setEmail(client.getEmail());
        clientService.updateClient(existingClient);
        return "redirect:/client";

    }


    @GetMapping("/clients/{id}")
    public  String deleteClientById (@PathVariable Long id){
        clientService.deleteClientById(id);
        return "redirect:/clients";


    }

}
