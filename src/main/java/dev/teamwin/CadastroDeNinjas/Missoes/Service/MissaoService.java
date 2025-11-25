package dev.teamwin.CadastroDeNinjas.Missoes.Service;

import dev.teamwin.CadastroDeNinjas.Missoes.Model.MissoesModel;
import dev.teamwin.CadastroDeNinjas.Missoes.Repository.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissaoService {

    private MissoesRepository missoesRepository;

    public MissaoService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // listar Missoes
    public List<MissoesModel> listarMissoes(){
        return  missoesRepository.findAll();
    }
}
