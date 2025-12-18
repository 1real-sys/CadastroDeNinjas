package dev.teamwin.CadastroDeNinjas.Missoes.Service;

import dev.teamwin.CadastroDeNinjas.Missoes.DTO.MissaoDTO;
import dev.teamwin.CadastroDeNinjas.Missoes.Mapper.MissaoMapper;
import dev.teamwin.CadastroDeNinjas.Missoes.Model.MissoesModel;
import dev.teamwin.CadastroDeNinjas.Missoes.Repository.MissoesRepository;
import dev.teamwin.CadastroDeNinjas.Ninjas.DTO.NinjaDTO;
import dev.teamwin.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissaoService {

    private MissoesRepository missoesRepository;
    private MissaoMapper missaoMapper;


    public MissaoService(MissaoMapper missaoMapper, MissoesRepository missoesRepository) {
        this.missaoMapper = missaoMapper;
        this.missoesRepository = missoesRepository;
    }

    // listar Missoes
    public List<MissaoDTO> listarMissoes(){
        List<MissoesModel> missoes = missoesRepository.findAll();
        return missoes.stream()
                .map(missaoMapper::map)
                .collect(Collectors.toList());
    }
    // Listar por Id
    public MissaoDTO listarPorId(Long id){
        Optional<MissoesModel> missaoPorId = missoesRepository.findById(id);
        return missaoPorId.map(missaoMapper::map).orElse(null);
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

    public MissaoDTO atualizarMissao(Long id, MissaoDTO missaoDTO){
        Optional<MissoesModel> missaoExistente = missoesRepository.findById(id);
        if(missaoExistente.isPresent()){
            MissoesModel missaoAtualizada = missaoMapper.map(missaoDTO);
            missaoAtualizada.setId(id);
            MissoesModel missaoSalva =  missoesRepository.save(missaoAtualizada);
            return missaoMapper.map(missaoSalva);
        }
        return null;


    }
}
