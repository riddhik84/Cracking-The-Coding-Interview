import java.util.HashMap;

public class WordFrequencies_02 {
  public static void main(String[] args) {
	  String[] book = {"abc" , "bcd", "test", "tess", "abcd", "", "  ", "aaaa", "aaaa"};
	  String[] searchWords = {"", "a", "abc", "abcc", "aaaa"};
	  HashMap<String, Integer> wordMap = new HashMap<>();
	  for (String s : searchWords){
		  if(wordMap.containsKey(s)){
			  System.out.println("Word count = " + wordMap.get(s));
		  } else {
			  int count = getWordCount(s);
			  System.out.println("Word count = " + count);
			  wordMap.put(s, count);
		  }
	  }
	}
	
	public static int getWordCount(String[] book, String searchWord){
		int counter = 0;
		for(int i = 0; i < book.length; i++){
			if(book[i].equals(searchWord)){
				counter++;
			}
		}
		return counter;
	}
}
