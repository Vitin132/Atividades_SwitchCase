

package Atividades_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT1_Calculadora {

    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        
        int num1, num2;
        int opcao;
        
        
        System.out.println("Digite um número:");
        num1 = tc.nextInt();
        
        System.out.println("Digite outro número: ");
        num2 = tc.nextInt();
        
        
        System.out.println("Escolha a operação: ");
        System.out.println("[1]- Soma");
        System.out.println("[2]- Subtração");
        System.out.println("[3]- Multiplicação");
        System.out.println("[4]- Divisão");
        opcao = tc.nextInt();
        
        int resultado = 0;
        String resposta;
        
        switch(opcao){
            
            case 1: 
                resultado = num1 + num2;
                
                break;
            case 2:
                resultado = num1 - num2;
                
                break;
            case 3:
                resultado = num1 * num2;
                
                break;
            case 4:
                resultado = num1 / num2;
                
                break;
            default:
                resposta = "Opcão inválida!";
                break;
                
        }
        System.out.println("O resultado é "+resultado);
        tc.close();
        
    }   
    
}
