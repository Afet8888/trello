package az.itstep.azjava.testapp.service;

import az.itstep.azjava.testapp.model.Team;

public interface TeamService {

    Team save (Team team);
    Team update (Team team);
    Team getById (Long id);
    void delete (Long id);
}
