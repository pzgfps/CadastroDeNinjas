package dev.java10x.cadastrodeninjas.Ninjas;

import dev.java10x.cadastrodeninjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// JPA = Java Persistence API, persistência de dados para BD
@Entity // Transforma uma classe java em uma  entidade no Banco de Dados
@Table(name = "tb_cadastro") // Gerando tabela de ninjas
@Data                   // Lombok - cria os getters e setters sozinho
@NoArgsConstructor      // Lombok - cria automaticamente os construtores, vazios e cheios
@AllArgsConstructor
public class NinjaModel extends MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;
    private int idade;

    @ManyToOne      // Uma missão pode rer vários ninjas
    @JoinColumn (name = "missoes_id")  // Foreign key - Chave estrangeira
    private MissoesModel missoes;
}
