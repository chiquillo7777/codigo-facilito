package org.benek.bootcamp.restdemo.init;

import org.benek.bootcamp.restdemo.model.Empleado;
import org.benek.bootcamp.restdemo.repository.EmpleadoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
public class LoadDatabase {


    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmpleadoRepository repository){
        return args -> {
            Empleado javier = new Empleado("javier Ramirez", "CTO");
            Empleado blanca = new Empleado("Blanca Pardo", "Project Manager");
            Empleado juan = new Empleado("Juan Rodriguez", "CEO");

            log.info("Carga Inicial: {}", repository.save(javier));
            log.info("Carga Inicial: {}", repository.save(blanca));
            log.info("Carga Inicial: {}", repository.save(juan));

            String[] test = new String[10];
            for (int i = 0; i < test.length; i++) {
                test[i] = i + "";
            }

            log.info("Carga Inicial: {}", Arrays.toString(test));

        };
    }
}
