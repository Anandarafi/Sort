/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HitungFibonaci;
import java.util.Scanner;
/**
 *
 * @author Anandarafi
 */
public class Tugas01 {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nHitung Fibonaci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    private static int tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke : ");
        int n = scanner.nextInt();
        
        return n;
    }
    
    
    
    
    public static void main(String[] args) {
        String identitas = "Ananda Rafi Amanullah / X RPL 3 / 04";
        
        tampilJudul(identitas);
        
        int n = tampilInput();
    }
}
