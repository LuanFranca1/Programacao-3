import java.util.Scanner;

public class Main {

    public static Scanner en = new Scanner(System.in);
    public static void main(String[]args){ 

        int menu;
        double base;
        double altura;
        double area;

        Triangulo triangulo = new Triangulo();

        do{ 
            menu();
            System.out.println("Digite o número dá área que quer calcular: ");
            menu = en.nextInt();
            switch(menu){ 
                case 1: 
                System.out.println("Digite a base do triângulo: ");
                base= en.nextDouble();
                System.out.println("Digite a altura do triângulo: ");
                altura=en.nextDouble();
                triangulo.calcularTriangulo(base, altura);

            }
        }while(menu!=0);
    }
    public static void menu( ){ 

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }

    
}
