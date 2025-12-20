package dev.teamwin.CadastroDeNinjas.Missoes.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.teamwin.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MissaoDTO {

    private Long id;
    private String nomeMissao;
    private String dificuldade;
    private List<NinjaModel> ninjas;
}
