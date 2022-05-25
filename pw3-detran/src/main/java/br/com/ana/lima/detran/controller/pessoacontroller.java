package br.com.ana.lima.detran.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ana.lima.detran.entity.Pessoa;
import br.com.ana.lima.detran.repository.pessoarepository;

@RestController

@RequestMapping("/pessoa")
public class pessoacontroller {

	@Autowired
	private pessoarepository repository;
	private List<Pessoa> dados = new ArrayList<Pessoa>();

	@GetMapping
	public List<Pessoa> listarTodos() {
		dados = repository.findAll();
		return dados;
	}
    @GetMapping
	public ResponseEntity <Pessoa> buscarPorId(@PathVariable Integer id) {
		
    	Optional<Pessoa> tipo = repository.findById(id);
    	if (tipo.isPresent()) {
    		ResponseEntity.noContent().build();
    	}
    	return ResponseEntity.ok(tipo.get());
	}

	@PostMapping
	public ResponseEntity<Pessoa> inserir(@RequestBody Pessoa pes) { 
		repository.save(pes);
		return ResponseEntity.ok(pes);
	}
	@PutMapping("/{idPessoa}")
	public void atualizar(@PathVariable Integer idPessoa, @RequestBody Pessoa pessoa) {
		boolean existe = repository.existsById(idPessoa);

		if (existe) {
			repository.save(pessoa);

		}

	}

}
