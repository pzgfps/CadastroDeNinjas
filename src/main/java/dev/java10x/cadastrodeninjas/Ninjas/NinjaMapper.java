package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO) {
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDTO.getId());         // ID
        ninjaModel.setNome(ninjaDTO.getNome());     // Nome
        ninjaModel.setEmail(ninjaDTO.getEmail());   // Email
        ninjaModel.setIdade(ninjaDTO.getIdade());   // Idade
        ninjaModel.setImgUrl(ninjaDTO.getImgUrl()); // ImgUrl
        ninjaModel.setRank(ninjaDTO.getRank());     // Rank
        ninjaModel.setMissoes(ninjaDTO.getMissoes());  // Missoes

        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel) {
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setRank(ninjaModel.getRank());
        ninjaDTO.setMissoes(ninjaModel.getMissoes());
        ninjaDTO.setImgUrl(ninjaModel.getImgUrl());

        return ninjaDTO;
    }
}
