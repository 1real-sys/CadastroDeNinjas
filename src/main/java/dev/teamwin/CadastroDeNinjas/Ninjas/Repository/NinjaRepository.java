package dev.teamwin.CadastroDeNinjas.Ninjas.Repository;

import dev.teamwin.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
