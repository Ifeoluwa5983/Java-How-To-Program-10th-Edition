package com.randomSentences;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RandomSentenceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		String[] article = {"the","a","one","some","any"};
		String[] noun = {"boy","girl","dog","town","car"};
		String[] verb = {"drove","jumped","ran","walked","skipped"};
		String[] preposition = {"to","from","over","under","on"};
		Random random = new Random();
		
		for(int i = 1;i <= 20; i++) {
			//int random1 = random .nextInt(5);
			System.out.printf("%s %s %s %s %s %s.%n", 
					article[i].toUpperCase().charAt(0) + article[i].substring(1),
					noun[random.nextInt(noun.length)],
					verb[random.nextInt(verb.length)],
					preposition[random.nextInt(preposition.length)],
					article[random.nextInt(article.length)],
					noun[random.nextInt(noun.length)]);
		}
		
	}

}
