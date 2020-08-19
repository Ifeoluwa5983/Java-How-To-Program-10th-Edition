package Exercise1613;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicateWords {
	 private Map<String, Integer> result = new HashMap<String, Integer>();

	    public Map<String, Integer> countDuplicate(String sentence) throws DuplicateWordException {
	        if (sentence == null || sentence.equals(" ")) {
	            throw new DuplicateWordException("Sentence cannot be empty");
	        }
	        for (String word : sentence.split(" ")) {
	            word = word.toLowerCase();
	            boolean exist = result.containsKey(word);
	            if (exist) {
	                int value = result.get(word);
	                value++;
	                result.put(word, value);
	            } else {
	                result.put(word, 1);
	            }
	        }
	        return result;
	    }

	    public int countWord(String word) {
	        if (result.containsKey(word.toLowerCase())) {
	            return result.get(word.toLowerCase());
	        }
	        return 0;
	    }

}
