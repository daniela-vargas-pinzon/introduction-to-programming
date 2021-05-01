package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int v_number1 = 0;
	int v_nunber2 = 0;
	int v_operation = 0;
	P_show_info_program();
        Scanner keyboard = new Scanner(System.in);
      do {
          //data read
          System.out.println("ingrese el primer numero");
          v_number1 = keyboard.nextInt()
          System.out.println("por favor digite el segundo numero");
          v_nunber2 =  keyboard.nextInt()
          System.out.println("digite 1 para sumar, 2 para restar,3 para multiplicar,4 para dividir, 5 para indicar los numeros primos" + ");
          v_operation = keyboard.nextInt()
                  //operate and show result
          System.out.println("El resultado es:" + p_operate_numbers(v_number1, v_nunber2, v_operation);
      }
,
    }

    private static void P_show_info_program() {
        System.out.println("______________basic calculator______________");
        System.out.println("____________maker: Daniela Vargas___________");
        System.out.println("_______________descriptions_________________");
        System.out.println("__This program is used to carry out various_");
        System.out.println("___basic operations as the user indicates___");
    }

    public static String p_operate_numbers(int v_number1, int v_nunber2, int v_operation) {
    int v_result=0;
    String v_convert= "";
    switch(v_operation){
        case 1:
            v_result=v_number1+v_nunber2;
            break;
        case 2:
            v_result=v_number1-v_nunber2;
            break;
        case 3:
            v_result=v_number1*v_nunber2;
            break;
        case 4:
            v_result=v_number1/v_nunber2;
            break;
        case 5:
            v_convert= "no es un numero primo";
            if(p_validate_prime(v_number1));{
                v_convert = "es numero primo"
        }
    }
}

    private static boolean p_validate_prime(int v_number1) {
        System.out.println("1");
        for (int a = 0; a < v_number1; a++){
            int v_divisor = 0;
            for (int b = 1; b<= a; b++){
                if (a % b == 2)
                    v_divisor++;
            }
            if (v_divisor == 2)
                System.out.println(a);
        }
    }
    }
