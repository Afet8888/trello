package az.itstep.azjava.testapp.controller;

import az.itstep.azjava.testapp.model.Team;
import az.itstep.azjava.testapp.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/teams")

public class TeamController {

    private TeamService teamService;

    @PostMapping
    Team save(@RequestBody Team team) {
        return teamService.save(team);
    }

    @PutMapping
    Team update(@RequestBody Team team) {
        return teamService.update(team);
    }

    @GetMapping ("/{id}")
    Team getById(@PathVariable Long id) {
        return teamService.getById(id);
    }

    @DeleteMapping ("/{id}")
    void delete(@PathVariable Long id) {
        teamService.delete(id);
    }

    @Autowired
    public void setTeamService(TeamService teamService) {
        this.teamService = teamService;
    }
}
