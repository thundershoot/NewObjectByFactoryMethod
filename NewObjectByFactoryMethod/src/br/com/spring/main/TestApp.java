package br.com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.spring.bean.Cliente;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"/br/com/spring/config/ApplicationContext.xml");

		Cliente cliente = (Cliente) appContext.getBean("clienteBean");

		System.out.println(cliente);
	}

}
