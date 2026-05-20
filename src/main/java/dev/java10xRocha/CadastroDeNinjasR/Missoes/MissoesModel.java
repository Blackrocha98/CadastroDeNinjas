package dev.java10xRocha.CadastroDeNinjasR.Missoes;

import dev.java10xRocha.CadastroDeNinjasR.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private NinjaModel ninja;

    private List<NinjaModel> ninjas;



}
