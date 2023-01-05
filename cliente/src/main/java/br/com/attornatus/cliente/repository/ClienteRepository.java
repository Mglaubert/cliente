package br.com.attornatus.cliente.repository;

import br.com.attornatus.cliente.entity.cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
