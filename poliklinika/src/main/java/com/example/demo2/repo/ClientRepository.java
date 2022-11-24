package com.example.demo2.repo;


import com.example.demo2.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client,Long> {


}
