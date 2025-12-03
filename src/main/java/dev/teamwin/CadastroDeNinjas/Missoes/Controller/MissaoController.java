package dev.teamwin.CadastroDeNinjas.Missoes.Controller;


import dev.teamwin.CadastroDeNinjas.Missoes.Model.MissoesModel;
import dev.teamwin.CadastroDeNinjas.Missoes.Service.MissaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    private MissaoService missaoService;

    public MissaoController(MissaoService missaoService) {
        this.missaoService = missaoService;
    }

    // Criar Missão (CREATE)
    @PostMapping("/criarMissao")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao) {
        return missaoService.criarMissao(missao);
    }

    // Mostrar todos as missões (READ)
    @GetMapping("/listarMissoes")
    public List<MissoesModel> listarMissao() {
        return missaoService.listarMissoes();
    }

    // Listar a missão por id (READ)
    @GetMapping("/missaoPorId/{id}")
    public MissoesModel missaoPorId(@PathVariable Long id) {
        return missaoService.listarPorId(id);
    }
    // Atualizar a missão por id (UPDATE)
    @PutMapping("/atualizarMissao")
    public String atualizarMissao() {
        return "Missão atualziada com sucesso";
    }

    // Deletar a missão por id (DELETE)
    @DeleteMapping("/deletarMissao/{$}")
    public void deletarMissao(@PathVariable Long id) {
        missaoService.deletarMissaoPorId(id);
    }
}
