package dev.teamwin.CadastroDeNinjas.Ninjas.Model;


import dev.teamwin.CadastroDeNinjas.Missoes.Model.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;

    // Relacionamento entre as tabelas, uma missao pode ter varios ninjas.
    @ManyToOne
    @JoinColumn(name = "missoes_id") // nome da chave estrangeira
    private MissoesModel missoes;


}
