package br.com.springbancoaop.manager;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ManagerTransationAccount {
	
    @Pointcut("execution(* *.sacar(..))")
    public void transacao(){}
    
    @Before("transacao()")
    public void saque(){
    	//poderia logar a info no arquivo de log
        System.out.println("Transa��o de saque inicializada");
    }
	
//	@Before("execution(* *.sacar(..))")
//	public void saque(){
//		System.out.println("Transa��o de saque inicializada");
//	}
    
    @AfterReturning("transacao()")
    public void retirada(){
        System.out.println("Transa��o de saque concluida com sucesso");
    }
   
    @Pointcut("execution(* *.depositar(..))")
    public void deposito(){}
   
    @Before("deposito()")
    public void depositar(){
    	System.out.println("Transa��o de deposito iniciada");
    }
   
    @AfterReturning("deposito()")
    public void depositado(){
    	System.out.println("deposito realizado com sucesso");
    }
}
