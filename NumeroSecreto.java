
package com.mycompany.numerosecreto;

import java.util.Random;
import java.util.Scanner;
public class NumeroSecreto {

    public static void main(String[] args) {
//Primeiro já publiquei a class scanner e random para fazer o jogo.
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();

      int NumeroSecreto = random.nextInt(1, 11);
      int Palpite= 0;
      int tentativas = 0;

      do {
           try{
            System.out.print("Digite um número entre 1 e 10: ");
            Palpite = scanner.nextInt();
            tentativas++;
//se o palpite for menor que o numero tente mais alto ou baixo         
      if(Palpite < NumeroSecreto){
          
            System.out.println("Mais alto!");
            
      } else if(Palpite > NumeroSecreto){
      
            System.out.println("Mais baixo!");
            
      }else{
         
            System.out.println("Parábens você acertou!");
//aqui define o plural da sentança de tentativas               
      if (tentativas == 1) {
      
             System.out.println("Você tentou " + tentativas + " vez.");
      
      }else {
    
       System.out.println("Você tentou " + tentativas + " vezes.");
    
      }}}
          catch (Exception e) { 
          System.out.println("Digite apenas números.");
          scanner.next();}}
      while (Palpite!= NumeroSecreto);
      scanner.close();  
   }
}
