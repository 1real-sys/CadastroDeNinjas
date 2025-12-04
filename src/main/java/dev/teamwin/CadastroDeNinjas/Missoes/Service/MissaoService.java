package dev.teamwin.CadastroDeNinjas.Missoes.Service;

import dev.teamwin.CadastroDeNinjas.Missoes.Model.MissoesModel;
import dev.teamwin.CadastroDeNinjas.Missoes.Repository.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    // Listar por Id
    public MissoesModel listarPorId(Long id){
        Optional<MissoesModel> missaoPorId = missoesRepository.findById(id);
        return missaoPorId.orElse(null);

    }

    // Cria missao
    public MissoesModel criarMissao(MissoesModel missao){
        return missoesRepository.save(missao);

    }
    // Deletar Missao por id - função void

    public void deletarMissaoPorId(Long id){
        missoesRepository.deleteById(id);
    }

    // Atualizar Missao

    public MissoesModel atualizarMissao(Long id, MissoesModel missaoAtualizada){
        if (missoesRepository.existsById(id)){
            missaoAtualizada.setId(id);
            return missoesRepository.save(missaoAtualizada);
        }
        return null;
    }
}
