package dev.java10x.cadastrodeninjas.Ninjas;

import dev.java10x.cadastrodeninjas.Missoes.MissoesModel;
import jakarta.persistence.*;
// Criando construtores vazios e totalmente preenchidos (Lombok faz automaticamente)
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
// Criando todos os getters e setter (Lombok faz automaticamente)
import lombok.Data;

import java.util.List;

// JPA = Java Persistence API, persistência de dados para BD
@Entity // Transforma uma classe java em uma  entidade no Banco de Dados
@Table(name = "tb_cadastro") // Gerando tabela de ninjas
@Data                   // Lombok - cria os getters e setters sozinho
@NoArgsConstructor      // Lombok - cria automaticamente os construtores, vazios e cheios
@AllArgsConstructor
public class NinjaModel  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")        // Criando a coluna id com o nome 'id' (ela normalmente cria sozinha com o mesmo nome)
    private Long id;

    @Column(name = "nome")      // Criando a coluna nome com o nome 'nome' (ela normalmente cria sozinha com o mesmo nome)
    private String nome;

    @Column(unique = true)      // Criando a coluna email com o nome 'email' (um usuario deve conter um email único)
    private String email;

    @Column(name = "img_url")   // Criando a coluna imgUrl com o nome 'img_url" (ela normalmente cria sozinha com o mesmo nome)
    private String imgUrl;

    @Column(name = "idade")     // Criando a coluna idade com o nome 'idade' (ela normalmente cria sozinha com o mesmo nome)
    private int idade;

    @ManyToOne      // Uma missão pode ter vários ninjas
    @JoinColumn (name = "missoes_id")  // Foreign key - Chave estrangeira
    private MissoesModel missoes;

}
