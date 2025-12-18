package dev.teamwin.CadastroDeNinjas.Missoes.Mapper;

import dev.teamwin.CadastroDeNinjas.Missoes.DTO.MissaoDTO;
import dev.teamwin.CadastroDeNinjas.Missoes.Model.MissoesModel;
import org.springframework.stereotype.Component;

@Component
public class MissaoMapper {

    public MissoesModel map(MissaoDTO missaoDTO) {
        MissoesModel missoesModel = new MissoesModel();
        missoesModel.setId(missaoDTO.getId());
        missoesModel.setNomeMissao(missaoDTO.getNomeMissao());
        missoesModel.setDificuldade(missaoDTO.getDificuldade());
        missoesModel.setNinjas(missaoDTO.getNinjas());

        return missoesModel;
    }

    public MissaoDTO map(MissoesModel missoesModel) {
        MissaoDTO missaoDTO = new MissaoDTO();
        missaoDTO.setId(missoesModel.getId());
        missaoDTO.setNomeMissao(missoesModel.getNomeMissao());
        missaoDTO.setDificuldade(missoesModel.getDificuldade());
        missaoDTO.setNinjas(missoesModel.getNinjas());

        return missaoDTO;
    }
    // para que serve isso ?
}
