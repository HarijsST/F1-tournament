package lv.formulaOne.tournament.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Teams")
public class Team {
    @Id
    @GeneratedValue
    private Long id;
    private String teamName;
    private int teamOverall;
}
