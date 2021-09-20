package br.unicentro.acaddecomp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.unicentro.acaddecomp.Sony;

class TVTest {

	@Test
	void testTVLigada() {
		Sony tv = new Sony();
		tv.on();
		tv.tuneChannel(3);
		assertTrue(tv.isOnoff());
		
	}
	
	@Test
	void testTVDesligada() {
		Sony tv = new Sony();
		tv.off();
		assertFalse(tv.isOnoff());
		
	}

}
