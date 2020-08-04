package com.Limerics;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LimericsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

//  A wonderful bird is the pelican,
//  His bill holds more than his belican.
//  He can take in his beak,
//  Enough food for a week,
//  But I'm damned if I see how the helican.

  String[] article = {"a", "the" };
  String[]  noun = {"bird", "bill", "food", "i"};
  String[] verb = {"is", "holds", "take", "damned", "can", "see"};
  String[] preposition = {"with", "than", "in", "but"};
  String[] matcher1 = {"week", "beak"};
  String[] matcher2 = {"belican", "pelican", "helican"};
  String[] adjective = {"wonderful", "enough", "more", "how"};


  
  @Test
  void testLimericks() {
      for (int i = 1; i < 6; i++) {
          System.out.println(getSentence(i));}
  }

  String getSentence (int i) {
      StringBuffer sentence = new StringBuffer();
      Random random = new Random();

      int index = random.nextInt(article.length);
      String word = article[index];
      sentence.append(word + " ");

      index = random.nextInt(adjective.length);
      word = adjective[index];
      sentence.append(word + " ");

      index = random.nextInt(noun.length);
      word = noun[index];
      sentence.append(word + " ");

      index = random.nextInt(verb.length);
      word = verb[index];
      sentence.append(word + " ");

      index = random.nextInt(preposition.length);
      word = preposition[index];
      sentence.append(word + " ");

      index = random.nextInt(article.length);
      word = article[index];
      sentence.append(word + " ");

      index = random.nextInt(matcher1.length);
      word = i == 3 || i == 4 ? matcher2[index] : matcher1[index];
      sentence.append(word + " ");

      return sentence.toString();
  }

}