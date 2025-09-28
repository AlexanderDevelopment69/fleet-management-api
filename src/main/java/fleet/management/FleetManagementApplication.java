package fleet.management;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FleetManagementApplication {

    public static void main(String[] args) {
        // Cargar .env y registrar en System properties
        Dotenv dotenv = Dotenv.configure()
                .ignoreIfMissing() // por si no está el archivo
                .load();

        dotenv.entries().forEach(entry ->
                System.setProperty(entry.getKey(), entry.getValue())
        );
        SpringApplication.run(FleetManagementApplication.class, args);
    }

}
