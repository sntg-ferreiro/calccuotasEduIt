package edu.educacionit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Configuration
// @ComponentScan({"edu.educacionit"})
class AppConfig {
    
    @Bean(name="servicioSaludo")
    public ISaludo obtenerSaludo() {
        /*
        if (System.getProperty("amort")==null) {
            throw new RuntimeException("Vino null");
        }
        */
        return new Saludo();
    }


@Bean(name="Aleman")
public CalculadorCuota aleman() {
	return new CalculadorCuota(new SistemaAleman());
}


@Bean(name="Americano")
public CalculadorCuota america() {
	return new CalculadorCuota(new SistemaAmerica());
}

@Bean(name="Frances")
public CalculadorCuota frances() {
	return new CalculadorCuota(new SistemaFrances());
}

interface ISaludo {
    void saludar();
}

class Saludo implements ISaludo {
    public void saludar() {
        System.out.println("S A L U D O  A  T O D O S ! ! ! ! ");
    }
}

}