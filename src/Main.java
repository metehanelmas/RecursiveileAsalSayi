import java.util.Scanner;
public class Main {


    static boolean isPrime() {
        Scanner input = new Scanner(System.in);
        int number;
        boolean result = false;

        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();
        int start = 2 , end = number;

        for (int i = start ; i <= end ; i++){
            result = true;
        for(int j = 2 ; j<=i/2 ; j++){
            if (i%j == 0){
                result = false;


            }
        }
        }

        return result ;

    }

    public static void main(String[] args) {

        System.out.println(isPrime());

    }
}
