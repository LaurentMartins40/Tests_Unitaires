package main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dev.utils.StringUtils;

public class TestUnitaire {
	@Test
	public void testLevenshteinDistance(){
		assertTrue(StringUtils.levenshteinDistance("coucou","coucou10")==2);
	}
}
