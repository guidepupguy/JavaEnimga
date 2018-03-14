package UsefulCrap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;

import UsefulCrap.ReversableTable;
import UsefulCrap.*;

public class Mains {
	public static Character[] testChar=new Character[] {'a','b','a','c','d','e'};
	public static Character[] testChar2=new Character[] {'q','w','e','r','t','y'};
	public  static Integer[] testInt=new Integer[] {1,2,3,4,5,5};
	
	
	public static void main(String[] args) {
		/*try {
			System.setErr(new PrintStream(new File("err.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
		Recircularbletable<Character, Character> test= new Recircularbletable<Character, Character>();
		CircularArray<Character> test2= new CircularArray<Character>();
		test.add(testChar2, testChar);
		System.out.println(Arrays.toString(test.getDatas('q')));
	}
}
