import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int altura;
        int largura;
        int area;

        System.out.println("Quais as medidas do quadrado? (altura e largura)");

        Scanner entrada = new Scanner(System.in);
        altura = entrada.nextInt();
        largura = entrada.nextInt();

        area = largura * altura;

        System.out.println("A área do Quadrado é: " + area);
        System.out.println("O dobro da área é: " + area * 2);

    }
}
