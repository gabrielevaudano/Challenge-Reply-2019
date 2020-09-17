package example1;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner; 

public class Example1 {

	public static void main(String[] args) {
		List<Character> file = new ArrayList<>();
		List<Character> stack = new ArrayList<Character>();
		List<Character> flow = new ArrayList<Character>();
		        
		 Scanner input;
		try {
			input = new Scanner(new File("input.txt"));
			
			char maze[][] = new char[5][7];
			  input.nextLine();
			     for (int row = 0; row < 5; row++) {
			        String fileLine = input.nextLine();
			        for (int col = 0; col < 7; col++) {
			              char nextChar = fileLine.charAt(col);
			              maze[row][col] = nextChar;
			              System.out.print(maze[row][col]);
			        }
			     }
			     
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  
	}
}
