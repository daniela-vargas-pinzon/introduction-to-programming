package usta.fis;
import org.w3c.dom.css.Counter;

import java.util.Scanner {
public class Main {

    public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    float [] numbers = new float [3];

	    for(int counter=0;counter<3;counter++){
	    	System.out.print((counter+1)+" Por favor digite las notas");
	    	numbers[counter]= entrada.nextFloat();
		}
	    System.out.println("sus calificaciones son:");
	    for (float counter:numbers);{
	    	System.out.println(Counter);
	    }
	}
}
