package dev.console;
import dev.service.CalculService;
import dev.service.CalculServiceTest;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App {
	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);
	private Scanner scanner;
	private CalculService calculatrice;
	public App(Scanner scanner, CalculService calculatrice) {
		
		this.scanner = scanner;
		this.calculatrice = calculatrice;
	}
	protected void afficherTitre() {
		LOG.info("**** Application Calculatrice ****");
	}
	public void demarrer() {
		afficherTitre();
	}
	protected void evaluer(String expression) {
		LOG.info(expression + "=" + calculatrice.additionner(expression));
	}
}