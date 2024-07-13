import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 6! = 6x5x4x3x2x1


        Scanner teclado = new Scanner(System.in);
        boolean finProceso = false;
        int numBase;


        System.out.println("Calculo Factorial");

        while (!finProceso) {

            System.out.println("Ingrese un numero entero postivo....: ");
            numBase = teclado.nextInt();

            if(numBase < 0){
                System.out.println("No se puede calcular el factorial de un número negativo.");
            } else {
                System.out.println("Resutado: "+ calcuarFactorial(numBase));
            }

            System.out.println("Desea salir del proceso (S) Si / Cualquier otra tecla y ENTER para continuar ...  ");

            String salir = teclado.next();

            if(salir.equalsIgnoreCase("s")){
                finProceso = true;
            }
        }
        teclado.close();

    }

    public static int calcuarFactorial(int numBase) {
        int resultado = numBase;

        if ((numBase == 0) || (numBase == 1)){
            return 1;
        }
        // i decremento en uno a partir de la base
        for (int i = (numBase-1); i > 1; i--) {
            // Ej nunBase 6 .. resultado = 6 x 5 -> (i-1)  resultado = (6 x 5) x 4 ... 
            resultado *= i;
        }
        return resultado;
        }
    }

