package Day03;

import java.util.ArrayList;

public class Alphabet {
	
	ArrayList<Character> alphabet = new ArrayList<Character>();
	
	Alphabet(){
	    char c;
	    for(c = 'a'; c <= 'z'; ++c) {
	    	alphabet.add(c);
	    }
	    
	    for(c = 'A'; c <= 'Z'; ++c) {
	    	alphabet.add(c);
	    }
	}
	
}
