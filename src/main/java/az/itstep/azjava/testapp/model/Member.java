package az.itstep.azjava.testapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tr_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String username;

    String password;

    String firstname;

    String lastname;

    String email;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_id")
    Team team;
}
