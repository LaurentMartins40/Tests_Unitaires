package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculService {

	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);
	public int additionner(String expression) {
		int somme=0;
		// TODO Ajouter un log en niveau DEBUG affichant "Evaluation de l'expression <expression>".
		// TODO par exemple "Evaluation de l'expression 1+4"
		LOG.debug("Evaluation de l'expression : " + expression);
		
		String[] tab = expression.split("\\+");
		
		for(int i = 0;i<tab.length;i++){
			System.out.println(tab[i]);
			somme = somme + Integer.parseInt(tab[i]);
		}
		return somme;
	}
}