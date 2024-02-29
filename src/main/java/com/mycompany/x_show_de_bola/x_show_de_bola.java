package com.mycompany.x_show_de_bola;

import java.util.Scanner;

public class x_show_de_bola {
     
                     
      /* 1 | cachorro quente | R$4.00
       2 | X-Salada        | R$4.50
       3 | X-Bacon         | R$5.00
       4 | Torrada simples | R$2.00
       5 | Refrigerante    | R$3.00*/
    
       

    public static void main(String[] args) {
        
        System.out.println("Nosso Cardário: \n1 | cachorro quente | R$4.00 \n"
                     + "2 | X-Salada        | R$4.50 \n"
                     + "3 | X-Bacon         | R$5.00 \n"
                     + "4 | Torrada simples | R$2.00 \n"
                     + "5 | Refrigerante    | R$3.00 \n");
        
        
        Scanner Batatao = new Scanner(System.in);
        
        int pedido, quantidade;
        double valor;
                                 
        System.out.println("Qual seu pedido, meu querido ?");
        pedido = Batatao.nextInt();
        
        System.out.println("A quantidade rapaz?");
        quantidade = Batatao.nextInt();
                         
                if (pedido == 1) {
                    valor = quantidade * 4.00;
                    System.out.println("Esse é o valor total: \nR$" + valor);
                }
                if (pedido == 2) {
                    valor = quantidade * 4.50;
                    System.out.println("Esse é o valor total: \nR$" + valor);
                }   
                if (pedido == 3) {
                    valor = quantidade * 5.00;
                    System.out.println("Esse é o valor total: \nR$" + valor);
                }   
                if (pedido == 4) {
                    valor = quantidade * 2.00;
                    System.out.println("Esse é o valor total: \nR$" + valor);
                }  
                if (pedido == 5) {
                    valor = quantidade * 3.00;
                    System.out.println("Esse é o valor total: \nR$" + valor);
                }  
            
       
            
                          }
            
                
        
        
                
                

    }

