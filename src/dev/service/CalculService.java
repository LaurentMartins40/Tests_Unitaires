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
		
		String[] calcul = expression.split("\\+");
		for(int i = 0;i<calcul.length;i++){
			somme = somme + Integer.parseInt(calcul[i]);
		}
		return somme;
	}
}