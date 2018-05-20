package az.itstep.azjava.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    /*
    /api/teams -> POST
    /api/teams/{teamId} -> GET
    /api/teams -> PUT (change name)
    /api/teams/{teamId} -> DELETE

    /api/boards -> POST
    /api/boards/{boardId} -> GET
    /api/boards -> PUT (ad deyishmek)
    /api/boards/{boardId} -> DELETE (with rows)

    /api/rows -> POST
    /api/rows/{rowId} -> GET (get row with tasks)
    /api/rows -> PUT (change row name)
    /api/rows/{rowId} -> DELETE (delete with tasks)

    /api/tasks -> POST
    /api/tasks/{taskId} -> GET
    /api/tasks -> PUT (change task text)
    /api/tasks -> DELETE
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
