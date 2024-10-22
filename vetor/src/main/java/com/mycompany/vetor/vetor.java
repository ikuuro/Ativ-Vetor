/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.Random;

public class vetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random ();
        
        //numero aleatorio entre 1 e 100
        
        int numeroSecreto = random.nextInt(100) +1;
        
        //vetor de armazenar
        int[] tentativas = new int[100];  //assumindo maximo de tentativas como 100
        int numTentativas = 0;
        boolean acertou = false;
        
        System.out.println("Bem-vindo ao jogo de advinhe o numero");
        System.out.println("Tente advinhar o numero secreto entre 1 e 100");
        
        
           while (!acertou) {
               System.out.print("Digite sua tentativa: ");
               int tentativa = scanner.nextInt();
               tentativas[numTentativas] = tentativa;
               numTentativas++;
               
               if (tentativa == numeroSecreto){
                   System.out.println("Parabéns, você acertou o numero secreto");
                   acertou = true;
                   

               }else if (tentativa < numeroSecreto){
                   System.out.println("O número é maior que "+ tentativa);
               }else{
                   System.out.println("O numero é menor que " + tentativa);
               }
           }
           System.out.println("Suas tentativas: ");
           for (int i = 0; i < numTentativas; i++){
               System.out.print(tentativas[i] + " ");
           }
           System.out.println();
           scanner.close();
        
    }
}
