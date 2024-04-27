package lv.formulaOne.tournament.service;

import lv.formulaOne.tournament.model.Team;
import lv.formulaOne.tournament.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultTeamService implements TeamService{
    @Autowired
    private TeamRepository teamRepository;
    @Override
    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }
}
