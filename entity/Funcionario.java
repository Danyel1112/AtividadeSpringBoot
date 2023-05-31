package br.com.springData.mvc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data // cria os getters e setters e toString automaticamente
@AllArgsConstructor // cria os construtores
@NoArgsConstructor // criar construtor vazio
@Builder // criação objetos criados
@Entity
public class Funcionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name= "nome", nullable = false)
    private String nome;
    @Column(name = "sobrenome", nullable = false)
    private String sobrenome;
    @Column(name = "salario")
    private float salario;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
