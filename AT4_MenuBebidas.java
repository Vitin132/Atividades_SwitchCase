

package Atividades_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT4_MenuBebidas {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        
        
        System.out.println("///// MENU DE BEBIDAS /////");
        
        System.out.println("Escolha uma das opções:");
        System.out.println("[1]- Refrigerante;");
        System.out.println("[2]- Suco;");
        System.out.println("[3]- Água;");
        int opcao = tc.nextInt();
        
        String mensagem = null;
        
        
        switch(opcao){
            case 1:
                mensagem = "Você escolheu refrigerante!";
                break;
            case 2:
                mensagem = "Você escolheu Suco!";
                break;
            case 3:
                mensagem = "Você escolheu Água!";
                break;
            
        }
        System.out.println(mensagem);
    }
    
    
    
}
