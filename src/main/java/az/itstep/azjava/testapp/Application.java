package az.itstep.azjava.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

}

