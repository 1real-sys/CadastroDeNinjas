package dev.teamwin.CadastroDeNinjas.Ninjas.Controller;

import dev.teamwin.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import dev.teamwin.CadastroDeNinjas.Ninjas.Service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Bem-vindo ao sistema de cadastro de ninjas!";
    }

    // Adicionar Ninjas (CREATE)
    @PostMapping("/criarNinja")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listarNinjas")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Listar ninjas por id (READ)
    @GetMapping("/listarNinjasId/{id}")
    public NinjaModel ninjaPorId(@PathVariable Long id) {
        return ninjaService.listarPorID(id);
    }

    // Alterar dados do ninja por id (UPDATE)
    @PutMapping("/atualizarNinja/{id}")
    public NinjaModel atualizarNinja(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

    // Deletar ninja por id (DELETE)
    @DeleteMapping("/deletarNinja/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);
    }

}
