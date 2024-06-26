package com.icorrea.mensagem;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class MensagemApplication {

	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(MensagemApplication.class, args);
		//System.out.println("Primeiro projeto springboot");
		//JOptionPane.showMessageDialog(null, "Primeiro projeto springboot");
		//create();
		//read();
		//update();
		//delete();
	}
	@PostConstruct
	public static void create() {
		System.out.println("Criação de um registro");
	}
	@PostConstruct
	public static void read() {
		System.out.println("Leitura de um registro");
	}
	@PostConstruct
	public static void update() {
		System.out.println("Atualização de um registro");
	}
	@PostConstruct
	public static void delete() {
		System.out.println("Exclusão de um registro");
	}
}
