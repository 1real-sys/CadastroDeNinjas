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
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "ranking")
    private String ranking;


    // Relacionamento entre as tabelas, uma missao pode ter varios ninjas.
    @ManyToOne
    @JoinColumn(name = "missoes_id") // nome da chave estrangeira
    private MissoesModel missoes;


}
