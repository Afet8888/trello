package az.itstep.azjava.testapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String username;

    String password;

    String firstname;

    String lastname;

    String email;

    @ManyToOne
    @JoinColumn(name = "team_id")
    Team team;
}
