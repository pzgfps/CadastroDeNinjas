package dev.java10x.cadastrodeninjas.Missoes;

import dev.java10x.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes") // Criando a tabela tb_missoes
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Gerando o valor do ID automaticamente (0 - 10000)
    private Long id;
    private String missao;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes") // Um ninja só pode ter uma missão atribuida
    private List<NinjaModel> ninja;

}
