package az.itstep.azjava.testapp.service.impl;

import az.itstep.azjava.testapp.model.Team;
import az.itstep.azjava.testapp.repository.TeamRepository;
import az.itstep.azjava.testapp.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    private TeamRepository teamRepository;

    @Override
    public Team save(Team team) {
        if (Objects.isNull(team)) throw  new RuntimeException("Team not entered");
        if (Objects.isNull(team.getId()) || Objects.isNull(team.getName()))
        throw new RuntimeException("Bad team data");
        return teamRepository.save(team);
    }

    @Override
    public Team update(Team team) {
        if (Objects.isNull(team)) throw  new RuntimeException("Team not entered");
        if (Objects.isNull(team.getId()) || Objects.isNull(team.getName()))
            throw new RuntimeException("Bad team data");
        if (!teamRepository.existsById(team.getId()))
            throw new RuntimeException("Nothing to update");
        return teamRepository.save(team);
    }

    @Override
    public Team getById(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        Optional<Team> team = teamRepository.findById(id);
        if(team.isPresent())
        return team.get();
        throw new RuntimeException("Team not found");
    }

    @Override
    public void delete(Long id) {
        if (Objects.isNull(id)) throw new RuntimeException("No id");
        teamRepository.deleteById(id);
    }

    @Autowired
    public void setTeamRepository(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
}
