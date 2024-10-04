import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int array[]=new int[20];
        Scanner numero = new Scanner(System.in);

        for (int i = 0; i <20; i++) {
            System.out.println("ingrese el valor la casilla " + i + " : ");

            int valor=numero.nextInt();
            array[i]=valor;
        }
        for (int i=0;i<20;i++){
        System.out.println("la casilla ["+i+"] tiene el valor de: ["+array[i]+"]");
    }
    }
}