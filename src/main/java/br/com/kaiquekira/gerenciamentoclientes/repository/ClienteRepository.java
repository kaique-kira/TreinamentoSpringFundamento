package br.com.kaiquekira.gerenciamentoclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kaiquekira.gerenciamentoclientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
