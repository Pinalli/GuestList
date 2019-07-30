package br.com.pinalli.guestList;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class GuestListApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuestListApplication.class, args);
	}
	
	 // Configuração de conexao trocada no application.properties
	@Bean
	public DataSource dataSource(){
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/lista");
		dataSource.setUsername("root");
	//	dataSource.setPassword("root");
		return dataSource;
	}
	
}
