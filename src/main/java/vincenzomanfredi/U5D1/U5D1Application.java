package vincenzomanfredi.U5D1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vincenzomanfredi.U5D1.entities.Menu;

@SpringBootApplication
public class U5D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5D1Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5D1Application.class);

        Menu menu = context.getBean(Menu.class);

        menu.stampaMenu();

    }
}
