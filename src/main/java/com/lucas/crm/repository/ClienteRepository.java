package com.lucas.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.crm.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
