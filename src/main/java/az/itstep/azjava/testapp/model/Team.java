package az.itstep.azjava.testapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @OneToMany(mappedBy = "team")
    List<Member> members;

    @OneToMany(mappedBy = "team")
    List<Board> boards;

}
