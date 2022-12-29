package Day03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	static char result;
	public static void main(String[] args) {
		
		BufferedReader reader;

		Alphabet alphabet = new Alphabet();
		int sum = 0;
		
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\adamc\\eclipse-workspace\\Day03\\src\\Day03\\input.txt"));
			String line = reader.readLine();

			while (line != null) {
//				System.out.println(line);
			
				int half = line.length()/2;
				char[] firstLine = (line.substring(0,half)).toCharArray();
				char[] secondLine = (line.substring(half,line.length())).toCharArray();
				
				for(int i = 0; i < firstLine.length; i++) {
					for(int j = 0; j < secondLine.length; j++) {
						if(firstLine[i] == secondLine[j]) {
							result = firstLine[i];
						}
					}
				}
				
				sum += (alphabet.alphabet.indexOf(result) + 1);
				
				
				line = reader.readLine();
				
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		System.out.println("Answer is:" + sum);
	
	}
}
