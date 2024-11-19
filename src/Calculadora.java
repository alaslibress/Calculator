import java.util.Scanner;
public class calculadora {
    public static void main(String[] args){
        //Variables
        int result = 0;
        int option = 0;
        //Loop of calculator for multiple selection of parameters
        while(option!=5){
            //Calculator Switch for division and addition part.
            System.out.println("""
                Indica en el menú que tipo de operación quieres hacer:
                1).- Suma
                2).- Resta
                3).- Multiplicación
                4).- División
                5).- Salir""");
            option = new Scanner(System.in).nextInt();
            System.out.println("Indica el primer número a calcular");
            int num1 = new Scanner(System.in).nextInt();
            System.out.println("Indica el segundo número a calcular");
            int num2 = new Scanner(System.in).nextInt();
            switch (option){
                case 1->{ //addition option
                    result = num1 + num2;
                }
                case 2->{ //Subtract option
                    result = num1 - num2;
                }
                case 3->{ //Multiply option
                    result = num1*num2;
                }
                case 4->{ //Division option
                    if(num1 == 0 || num2 == 0){ //In case of num1 or num2 == 0, the program print error.
                        System.out.println("Es imposible dividir un número entre 0");
                    }else{
                        result = num1 / num2;
                    }
                }
                case 5->{ //Exit option
                    System.out.println("¡Adios!");
                }
                default->{ //Default option
                    System.out.println("No has seleccionado una opción valida.");
                }
            }
            //Print result
            System.out.println("El resultado es: "+result);
        }
    }
}
