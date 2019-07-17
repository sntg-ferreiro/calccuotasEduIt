package edu.educacionit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.educacionit.AppConfig.ISaludo;
import edu.educacionit.AppConfig.Saludo;

public class App {

	    public static void main( String[] args )
	    {
	        ApplicationContext appContext =
	                new AnnotationConfigApplicationContext(AppConfig.class);
	        
	        
	        ISaludo saludo =
	                appContext.getBean("servicioSaludo", Saludo.class);
	        
	        saludo.saludar();
	        CalculadorCuota calc = null;
	        System.out.println(System.getProperty("tipoAmortizacion"));
	        String s = System.getProperty("tipoAmortizacion");
	        
	        switch (s) {
	        case "Aleman": calc = appContext.getBean("Aleman",CalculadorCuota.class);
	        	
	        break;
	        case"Americano": calc =  appContext.getBean("Americano",CalculadorCuota.class);
	        	
	        	break;
	        case "Frances": calc =   appContext.getBean("Frances", CalculadorCuota.class);
	        break;
	        default: System.out.println("Sistema no seleccionado");
	        	break;
	        }
	    
	        if(calc != null)
	        	calc.calcular(100);
	    }
	
	}

