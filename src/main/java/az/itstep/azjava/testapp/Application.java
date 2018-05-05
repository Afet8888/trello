package az.itstep.azjava.testapp;

import az.itstep.azjava.testapp.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Application {

    /*
     * Luget. 2 dil. En, Az.
     * Lugete sozler elave etmek
     * Sozu az dilinde gonderib ingilis dilinde
     * tercumesini almaq
     * Sozu ingilis dilinde gonderib az dilinde
     * tercumesini almaq
     *
     * Sozleri tekce qeydiyyatdan kecmish
     * userler elave ede biler
     * 1. User modeli yaratmaq
     * 2. User repository yaratmaq
     * 3. User Service yaratmaq (token ve sair)
     * 4. UserController yaratmaq (qeydiyyat, girish)
     *
     * Word {
     *  id, String az, String en;
     * } Create
     * /az/{word} -> ingilis dilinde tercume
     * /en/{word} -> azerbaycan dilinde tercume
     *
     *
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    Map<String, User> getAuthorizedMap() {
        return new HashMap<>();
    }

}

