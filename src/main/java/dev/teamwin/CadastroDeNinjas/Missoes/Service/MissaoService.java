package dev.teamwin.CadastroDeNinjas.Missoes.Service;

import dev.teamwin.CadastroDeNinjas.Missoes.DTO.MissaoDTO;
import dev.teamwin.CadastroDeNinjas.Missoes.Mapper.MissaoMapper;
import dev.teamwin.CadastroDeNinjas.Missoes.Model.MissoesModel;
import dev.teamwin.CadastroDeNinjas.Missoes.Repository.MissoesRepository;
import dev.teamwin.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissaoService {

    private final NinjaRepository ninjaRepository;
    private MissoesRepository missoesRepository;
    private MissaoMapper missaoMapper;


    public MissaoService(MissoesRepository missoesRepository, MissaoMapper missaoMapper, NinjaRepository ninjaRepository) {
        this.missoesRepository = missoesRepository;
        this.missaoMapper = missaoMapper;
        this.ninjaRepository = ninjaRepository;
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
    public MissaoDTO criarMissao(MissaoDTO missaoDTO){
        MissoesModel missoesModel =  missaoMapper.map(missaoDTO);
        missoesModel = missoesRepository.save(missoesModel);
        return missaoMapper.map(missoesModel);

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
