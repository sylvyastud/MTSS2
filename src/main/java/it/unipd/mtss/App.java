////////////////////////////////////////////////////////////////////
// Silvia Rovea 1223863
// Alessandro Baldissera 1216742
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Inserisci un numero da convertire: ");
            int num = scan.nextInt();
            System.out.println(RomanPrinter.print(num));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }
    }
}
