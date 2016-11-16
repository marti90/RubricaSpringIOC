package it.alfasoft.martina.prova;

import it.alfasoft.martina.model.Rubrica;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProva {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Rubrica r = (Rubrica)context.getBean("rubrica");
		
		r.getVoceByNome("Martina");

	}

}
