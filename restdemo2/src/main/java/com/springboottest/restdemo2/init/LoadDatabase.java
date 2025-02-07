package com.springboottest.restdemo2.init;

import com.springboottest.restdemo2.model.Empleado;
import com.springboottest.restdemo2.repository.EmpleadoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabse(EmpleadoRepository repository){
        return args -> {
            Empleado javier = new Empleado("Javier", "CTO");

            int[] test = new int[];
        };
    }
}
