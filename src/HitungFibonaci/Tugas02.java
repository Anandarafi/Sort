
package HitungFibonaci;
import java.util.*;
public class Tugas02 {
    public static void main(String[] args) {
        System.out.println("Pecahannya adalah Rp 5.000, Rp 2.000, Rp 1.000, Rp 500, Rp 100");
        int uang = input();
        int[] Nominal = new int[]{5000, 2000, 1000, 500, 100};
        
        JumlahUang(uang, Nominal);
    }
    private static int input()
    {
       Scanner baca = new Scanner(System.in);
       
       System.out.print("Jumlah Uang = Rp ");
       int uang = baca.nextInt();
       
       return uang;
    }
    private static void JumlahUang(int uang, int[] Nominal)
    {
        for(int i = 0; i < Nominal.length; i++)
        {
            int n = 0;
            while(uang >= Nominal[i])
            {
                uang = uang - Nominal[i];
                n++;
            }
            System.out.println
        (Nominal[i] + " Sebanyak " + n + " lembar");
        }
    }
 
}
