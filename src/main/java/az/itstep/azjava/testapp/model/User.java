package az.itstep.azjava.testapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "its_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;

}
