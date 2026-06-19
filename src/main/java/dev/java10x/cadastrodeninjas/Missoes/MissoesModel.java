package dev.java10x.cadastrodeninjas.Missoes;

import dev.java10x.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String missao;
    private String dificuldade;
    private NinjaModel ninja;

    public MissoesModel() {
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() {
        return "MissoesModel{" +
                "missao='" + missao + '\'' +
                ", dificuldade='" + dificuldade + '\'' +
                '}';
    }
}
