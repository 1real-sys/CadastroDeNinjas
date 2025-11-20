package dev.teamwin.CadastroDeNinjas.Missoes.Repository;

import dev.teamwin.CadastroDeNinjas.Missoes.Model.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long > {
}
