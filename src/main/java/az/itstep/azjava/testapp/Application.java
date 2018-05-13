package az.itstep.azjava.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    /*
    User { id, username, password, email }
    Message { id, text, sendTime, senderId,
                        receiverId }

    POST /signup  USER -> save user
    POST /signin {username, password} -> TOKEN
    GET /chats -> Get all chats for this user
    GET /chats/{senderId} -> Get all messages with
                            sender
    POST /chats MESSAGE -> save new message
    */

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
//https://docs.spring.io/spring-security/site/docs/5.0.3.RELEASE/reference/htmlsingle/
}
