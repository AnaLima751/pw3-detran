package br.com.ana.lima.detran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ana.lima.detran.entity.Pessoa;

public interface pessoarepository extends JpaRepository<Pessoa, Integer>{

}
