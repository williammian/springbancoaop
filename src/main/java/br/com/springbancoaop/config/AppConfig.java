package br.com.springbancoaop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="br.com.springbancoaop")
@EnableAspectJAutoProxy
public class AppConfig {

}
