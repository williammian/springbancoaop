package br.com.springbancoaop.main;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.springbancoaop.bean.Client;
import br.com.springbancoaop.config.AppConfig;

public class MainBankMachine {

	public static void main(String[] args) {
						
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
						
		Client bean = (Client) ctx.getBean("client");
		
        bean.sacar(BigDecimal.TEN);
        
        ctx.close();
	}
	
}
