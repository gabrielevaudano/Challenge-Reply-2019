package example1;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Example1 {

	public static void main(String[] args) {
		List<Character> file = new ArrayList<>();
		List<Character> stack = new ArrayList<Character>();
		List<Character> flow = new ArrayList<Character>();
		        
        try {
            // apre il file in lettura
            FileReader filein = new FileReader("input.txt");
            
            int next;
            do {
                next = filein.read(); // legge il prossimo carattere
                
                if (next != -1) { // se non e' finito il file
                    char nextc = (char) next;
                    System.out.print(nextc); // stampa il carattere
                }

            } while (next != -1);
            
            filein.close(); // chiude il file
            
        } catch (IOException e) {
            System.out.println(e);
        }

}
