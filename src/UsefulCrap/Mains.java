package UsefulCrap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;

import UsefulCrap.ReversableTable;
import UsefulCrap.*;

public class Mains {
	public static Character[] testChar=new Character[] {'a','b','a','c','d','e'};
	public  static Integer[] testInt=new Integer[] {1,2,3,4,5,5};
	
	
	public static void main(String[] args) {
		try {
			System.setErr(new PrintStream(new File("err.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ReversableTable<Integer, Character> test= new ReversableTable<Integer, Character>();
		CircularArray<Character> test2= new CircularArray<Character>();
		test2.add(testChar);
		test2.finalise();
		
		System.out.println(test2.get(-2));
		test.add( testInt,testChar);
	}

}
