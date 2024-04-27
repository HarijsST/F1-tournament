package lv.formulaOne.tournament.controller;

import lv.formulaOne.tournament.model.Team;
import lv.formulaOne.tournament.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/team")
@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;
    @PostMapping
    public Team createTeam(@RequestBody Team team){
        return teamService.createTeam(team);
    }
}
