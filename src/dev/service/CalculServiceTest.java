package dev.service;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.*;

import dev.exception.CalculException;
/**
 * Test unitaire de la classe dev.service.CalculService.
 */
public class CalculServiceTest {
	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);
			

	@Test
	public void testAdditionner() throws CalculException {
		LOG.info("Etant donné, une instance de la classe CalculService"); 
		//TODO
		
		CalculService calcul = new CalculService();
		
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4"); 
		//TODO
		int somme = calcul.additionner("1+3+4");
		LOG.info("Alors j'obtiens le résultat " + somme);
		// TODO
		assertThat(somme).isEqualTo(8);
	}
}