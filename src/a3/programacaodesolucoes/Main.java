/**
 * @author David, Rilton, João, Lucas
 */
 
package a3.programacaodesolucoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 1272228159
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        ArrayList<Animacao> anima = new ArrayList<Animacao>();
        
        System.out.println(" Bem vindo ao Sistema de Popularidade de Animes ");
        System.out.println(" ");
        
        do
        {
           System.out.println("Digite 0 para sair | digite 1 para cadastrar um anime");
           opcao = scan.nextInt();
        
           switch(opcao)
           {
               case 0:
                   break;
           
               case 1:
                   System.out.println(" ---  Cadastre as informações  --- ");                   
                   System.out.println("Digite o nome do anime:  ");
                   
           }
           
        }while(opcao == 1);
         
    }   
}
