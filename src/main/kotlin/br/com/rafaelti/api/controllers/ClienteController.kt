package br.com.rafaelti.api.controllers
import br.com.rafaelti.api.model.Cliente
import br.com.rafaelti.api.repository.ClienteRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/clientes")
class ClienteController(private val repository: ClienteRepository) {

    @GetMapping
    fun listar(): List<Cliente> = repository.findAll()

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Cliente =
        repository.findById(id).orElseThrow { Exception("Cliente não encontrado") }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun criar(@RequestBody cliente: Cliente): Cliente = repository.save(cliente)

    @PutMapping("/{id}")
    fun atualizar(@PathVariable id: Long, @RequestBody cliente: Cliente): Cliente {
        val existente = repository.findById(id).orElseThrow{ Exception("Cliente não encontrado") }

        val atualizado = existente.copy(nome = cliente.nome, email = cliente.email)
        return repository.save(atualizado)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletar(@PathVariable id: Long) {
        repository.deleteById(id)
    }

}