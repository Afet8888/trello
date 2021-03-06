package az.itstep.azjava.testapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tr_task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taskText;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "row_id")
    private Row row;
}
