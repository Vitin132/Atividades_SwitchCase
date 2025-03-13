package Atividades_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT3_ClassTriangulos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        double L1 = teclado.nextDouble();

        System.out.println("Digite o segundo lado: ");
        double L2 = teclado.nextDouble();

        System.out.println("Digite o terceiro lado ");
        double L3 = teclado.nextDouble();

        if ((L1 + L2 > L3) && (L1 + L3 > L2) && (L2 + L3 > L1)) {

            int triangulo = 0;
            if (L1 == L2) {
                triangulo++;
            }
            if (L1 == L3) {
                triangulo++;
            }
            if (L2 == L3) {
                triangulo++;
            }

            switch (triangulo) {
                case 1:
                    System.out.println("Isósceles");
                    break;
                case 0:
                    System.out.println("Escaleno");
                    break;
                case 3:
                    System.out.println("Equilatero");
                default:
                    System.out.println("Indefinido");
                    break;

            }

        } else {

            System.out.println("Os lados informados não formam um triângulo!");

        }

    }

}
