package dev.teamwin.CadastroDeNinjas.Missoes.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissaoController {

    // Criar Missão (CREATE)
    @PostMapping("/criarMissao")
    public String criarMissao() {
        return "Missão criada com sucesso";
    }

    // Mostrar todos as missões (READ)
    @GetMapping("/listarMissoes")
    public String listarMissao() {
        return "Lista de todas as missões";
    }

    // Listar a missão por id (READ)
    @GetMapping("/missaoPorId")
    public String missaoPorId() {
        return "Detalhes da Missão por ID";
    }
    // Atualizar a missão por id (UPDATE)
    @PutMapping("/atualizarMissao")
    public String atualizarMissao() {
        return "Missão atualziada com sucesso";
    }

    // Deletar a missão por id (DELETE)
    @DeleteMapping("/deletarMissao")
    public String deletarMissao() {
        return "Missão deletada com sucesso";
    }
}
