package SpringBootTeste.Start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

@EnableAutoConfiguration
@ComponentScan(basePackages = "SpringBootTeste")
public class AplicationStart {
    public static void main(String[] args){
        SpringApplication.run(AplicationStart.class, args);
    }
}
