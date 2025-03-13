

package Atividades_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT2_DiasSemana {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        int dia;
        
        
        System.out.println("Digite um número de 1 a 7");
        dia = tc.nextInt();
        
        
        String mensagem = null;
        
        switch(dia){
            
            case 1:
                mensagem = "Domingo";
                break;
            case 2:
                mensagem = "Segunda-Feira";
                break;
            case 3:
                mensagem = "Terça-Feira";
                break;
            case 4:
                mensagem = "Quarta-Feira";
                break;
            case 5:
                mensagem = "Quinta-Feira";
            case 6:
                mensagem = "Sexta-Feira";
                break;
            case 7:
                mensagem = "Sábado";
                break;
        }
        System.out.println(mensagem);
        
        
    }
    

}
