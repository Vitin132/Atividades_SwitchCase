

package Atividades_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT5_IMC {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
       
        
        
        double altura, peso;
        
        
        
        System.out.println("Cálculo de IMC");
        System.out.println("Digite a sua altura:");
        altura = tc.nextDouble();
        System.out.println("Digite quanto você pesa em Kg:");
        peso = tc.nextDouble();
        
       
        
        double imc = peso/(altura*altura);
        int categoria;
        
        if (imc < 18.5){
            
            categoria = 1;
            
        }else if(imc < 25){
            
            categoria = 2;
            
        }else if(imc < 30){
            categoria = 3;
        }else{
            categoria = 4;
            
        }
        
        switch(categoria){
            case 1:
                System.out.println("Abaixo do peso!");
                break;
            case 2:
                System.out.println("Peso ideal!");
                break;
            case 3:
                System.out.println("Sobrepeso!");
                break;
            case 4:
                System.out.println("Obesidade!");
                break;
            default:
                System.out.println("Categoria inválida!");
                break;
        }
        
        
        
        
    }
    
    
    
}
