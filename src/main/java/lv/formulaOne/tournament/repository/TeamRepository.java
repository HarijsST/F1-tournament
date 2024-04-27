package lv.formulaOne.tournament.repository;

import lv.formulaOne.tournament.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
