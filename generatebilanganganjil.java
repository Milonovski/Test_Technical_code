import java.util.*;
public class Main
{
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        
        int angka = input.nextInt();
        
        for(int i = 1; i <= angka; i+=2){
            System.out.print(i + "");
        }
	}
}