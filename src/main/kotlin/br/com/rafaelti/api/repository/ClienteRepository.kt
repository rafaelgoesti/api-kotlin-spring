package br.com.rafaelti.api.repository

import br.com.rafaelti.api.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository : JpaRepository<Cliente, Long>
