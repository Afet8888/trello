package az.itstep.azjava.testapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @OneToMany(mappedBy = "board")
    List<Row> rows;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_id")
    Team team;
}
