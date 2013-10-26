/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Macierze;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Rubin
 */
public class Macierze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        Random GeneratorLiczb;    
        Scanner wielkosc;
        int[][] Tablica1;
        int[][] Tablica2;
        int[][] Tablica3;
        Program2 object;
        int wiersz;
        int kolumna;
             
        GeneratorLiczb = new Random(); 
        
        wielkosc = new Scanner(System.in);
        
        System.out.println("Podaj liczbę wierszy macierzy :");
        wiersz=wielkosc.nextInt();
        System.out.println("Podaj liczbę kolumn macierzy :");
        kolumna=wielkosc.nextInt();
        Tablica1= new int[wiersz][kolumna];
        Tablica2= new int[wiersz][kolumna];
        Tablica3= new int [wiersz][kolumna];
        object = new Program2();
                System.out.println("Macierz A :\n ");
                        for(int i=0;i<wiersz;i++)
        {
            for(int j=0;j<kolumna;j++)
            {
                Tablica1[i][j] = GeneratorLiczb.nextInt(99);
                System.out.print(Tablica1[i][j] + " ");
                           }
            
            System.out.println();
       }
        System.out.println("Macierz B: \n");
        
          for(int a=0;a<wiersz;a++)
        {
            for(int j=0;j<kolumna;j++)
            {
                Tablica2[a][j] = GeneratorLiczb.nextInt(99);
                System.out.print(Tablica2[a][j] + " ");
                            }
            System.out.println();
        }            
            object.stala(Tablica1, Tablica3 ,wiersz ,kolumna);
            object.pokaz(Tablica3, wiersz, kolumna);   
            
            System.out.println("Mnożenie, A * B :\n");   // a*b
        
            object.mnozenie(Tablica1, Tablica2,Tablica3 ,wiersz ,kolumna);
            if(wiersz==kolumna)
            object.pokaz(Tablica3, wiersz, kolumna);
            
                   System.out.println("Dodawanie A+B:\n");         // a+b
            object.dodawanie(Tablica1,wiersz,kolumna,Tablica2,Tablica3);
            object.pokaz(Tablica3, wiersz, kolumna);                    
     
        System.out.println("Odejmowanie A-B:\n");          // a-b
            object.odejmowanie(Tablica1,Tablica2,Tablica3 ,wiersz,kolumna);
            object.pokaz(Tablica3, wiersz, kolumna);                             
    }
}
    

