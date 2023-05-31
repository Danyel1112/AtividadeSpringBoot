package br.com.springData.mvc.repository;

import br.com.springData.mvc.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> { // acesso a metodos implementados

}
