package dev.teamwin.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Bem-vindo ao sistema de cadastro de ninjas!";
    }

    // Adicionar Ninjas (CREATE)
    @PostMapping("/criarNinja")
    public String criarNinja() {
        return "Ninja criado com sucesso!";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listarNinjas")
    public String listarNinjas() {
        return "Lista de todos os ninjas.";
    }

    // Listar ninjas por id (READ)
    @GetMapping("/ninjaPorId")
    public String ninjaPorId() {
        return "Detalhes do ninja por ID.";
    }

    // Alterar dados do ninja por id (UPDATE)
    @PutMapping("/atualizarNinja")
    public String atualizarNinja() {
        return "Ninja atualizado com sucesso!";
    }

    // Deletar ninja por id (DELETE)
    @DeleteMapping("/deletarNinja")
    public String deletarNinja() {
        return "Ninja deletado com sucesso!";
    }

}
