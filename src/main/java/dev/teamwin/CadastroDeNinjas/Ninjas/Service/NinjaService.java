package dev.teamwin.CadastroDeNinjas.Ninjas.Service;

import dev.teamwin.CadastroDeNinjas.Ninjas.DTO.NinjaDTO;
import dev.teamwin.CadastroDeNinjas.Ninjas.Mapper.NinjaMapper;
import dev.teamwin.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import dev.teamwin.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Listar todos os meus ninjas=
    public List<NinjaModel> listarNinjas() {
       return ninjaRepository.findAll();
    }

    // Listar por id
    public NinjaModel listarPorID(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);

    }

    // Criar Novo Ninja

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        ninjaModel = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninjaModel);
    }

    // Deletar Ninja - Tem que ser um método Void
    public void deletarNinjaPorId(Long id){
         ninjaRepository.deleteById(id);
    }

    // Atualizar Ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado){
        if(ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }


}
