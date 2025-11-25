package dev.teamwin.CadastroDeNinjas.Ninjas.Service;

import dev.teamwin.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import dev.teamwin.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas() {
       return ninjaRepository.findAll();
    }

    // Listar por id
    public NinjaModel listarPorID(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);

    }


}
