import java.util.*;
public class Main
{
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        
        int angka = input.nextInt();
        String strAngka = Integer.toString(angka);
        int panjangAngka = strAngka.length();
        
        for(int i = 0; i<panjangAngka;i++){
            System.out.print(strAngka.charAt(i));
            for(int j = 0; j <i+1 ;j++){
                System.out.print("0");
             }
             System.out.println();
        }
	}
}