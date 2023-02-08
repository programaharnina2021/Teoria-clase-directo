package control;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JLabel;

import org.junit.jupiter.api.Test;

class GameBehaviourTest {

	@Test
	void testGetRandomNumber() {
		GameBehaviour gameBehaviour=new GameBehaviour(new JLabel(),new JLabel());
		for (int i = 0; i < 10; i++) {
			System.out.println(gameBehaviour.getRandomNumber(10, 50));
		}
	}

}
