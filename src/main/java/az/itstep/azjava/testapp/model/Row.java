package az.itstep.azjava.testapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "tr_row")
public class Row {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @OneToMany(mappedBy = "row")
    List<Task> tasks;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "board_id")
    Board board;
}
