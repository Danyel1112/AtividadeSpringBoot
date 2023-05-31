package br.com.springData.mvc.service;

import br.com.springData.mvc.entity.Funcionario;
import br.com.springData.mvc.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public  Funcionario salvar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public  List<Funcionario> listaFuncionario() {
        return funcionarioRepository.findAll(); //lista todos funcionarios salvos
    }

    public Optional<Funcionario> buscarPorId(Long id) { //procura pelo ID o funcionario cadastrado
        return funcionarioRepository.findById(id);
    }

    public void removerPorId(Long id) { //deleta pelo ID
        funcionarioRepository.deleteById(id);
    }

}
