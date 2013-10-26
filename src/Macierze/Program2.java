/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Macierze;
import java.util.Scanner;
/**
 *
 * @author Rubin
 */
public class Program2{
    
    public void pokaz(int [][] Macierz,
            int wiersz ,
            int kolumna) // pokaz macierzy
    {             for(int i=0;i<wiersz;i++)
                   
             {            for(int j=0;j<kolumna;j++)
            {
                System.out.print(" " + Macierz[i][j]   );
                
            }
             System.out.println();
        } 
    }
    public void stala(int[][] MacierzA ,
            int[][] MacierzC ,
            int  wiersz ,
            int kolumna) // Metoda A* stała
    {
        Scanner pobierz = new Scanner(System.in);
        System.out.println("Podaj stałą dla macierzy A:");
        
        int stala = pobierz.nextInt();
       
        
        
        System.out.println("Macierz A*" +  stala );
        
        for(int i=0;i<wiersz;i++)
            for(int j=0;j<kolumna;j++)
            {
                MacierzC[i][j]= MacierzA[i][j]*stala;         
            }
    
    }
   
    public void dodawanie(int[][] MacierzA ,//metoda dodawania
            int wiersz ,
            int kolumna,
            int[][] MacierzB ,
            int[][] MacierzC) // 
    {
    for(int i=0 ;i<wiersz;i++)
        for(int j=0;j<kolumna;j++)
        {
         MacierzC[i][j] = MacierzA[i][j]+MacierzB[i][j];
        }
    }
    public void odejmowanie(int[][] MacierzA ,//metoda odejmowania
            int[][] MacierzB ,
            int[][] MacierzC, 
            int wiersz ,
            int kolumna)
    {
    for(int i=0 ;i<wiersz;i++)
        for(int j=0;j<kolumna;j++)
        {
         MacierzC[i][j] = MacierzA[i][j]-MacierzB[i][j];
        }
    }
    
    
    
    public void mnozenie(int [][] MacierzA, // metoda mnożenia
            int [][] MacierzB ,
            int [][] MacierzC ,
            int  wiersz ,
            int kolumna) // 
    {
    
    for(int i=0;i<wiersz;i++)
    {      
      if(wiersz!=kolumna)
    {System.out.println("Nie można wykonać działania");
    
    break;
    }
    else
    {
      for(int j=0;j<wiersz;j++)
      {
             for(int k=0;k<wiersz;k++)
             {
               MacierzC[i][j] += MacierzA[i][k]*MacierzB[k][j];
              }
      }
    }
   }    
  }
}

            
    

