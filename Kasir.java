/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;
import java.util.Scanner;

/**
 *
 * @author wilda
 */
public class Kasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean kasir = true;
            String KString = "y";
        while (kasir) {
            int [] nominal = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
          
            Scanner bebasScanner =  new Scanner(System.in);
            
            int uang, total, susuk;
            
            System.out.print("jumlah uang : ");
            uang = bebasScanner.nextInt();
            System.out.print("total belanja :");
            total = bebasScanner.nextInt();
            
            susuk = uang - total;
            System.out.println("Total kembalian = "+susuk);


            for (int I=0;I<susuk;I++){
                int jumlah = susuk/nominal[I];
                susuk-= jumlah*nominal[I];
                if (jumlah == 0){
                    
                }
                else {
                    System.out.println("Rp "+nominal[I]+" = "+jumlah+" Lembar");
                }
                 // TODO code application logic here
    }
    
}}}
