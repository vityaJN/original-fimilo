package backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.fimilo")
@EntityScan(basePackages = "com.fimilo")
public class FimiloApplication {
    public static void main(String[] args) {
        SpringApplication.run(FimiloApplication.class, args);
    }
}
