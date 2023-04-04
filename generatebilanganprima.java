import java.util.*;
public class Main
{
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        
        int angka = input.nextInt();
        for(int i = 2; i <=angka; i++){
            boolean isPrima = true;
            
            for(int j = 2; j <=Math.sqrt(i);j++){
                if(i%j == 0){
                    isPrima = false;
                    break;
                }
                
            }
            
            if(isPrima){
                System.out.print(i + "");
            }
            
        }
	}
}