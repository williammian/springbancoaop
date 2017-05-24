package br.com.springbancoaop.bean;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class Client {

	public void sacar(BigDecimal value) {
        System.out.println("Saque realizado com sucesso " + value);
	}
	
	public void depositar(BigDecimal value) {
        System.out.println("Deposito realizado " + value);
	}
	
}
