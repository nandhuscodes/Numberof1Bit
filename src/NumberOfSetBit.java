import java.util.Scanner;

public class NumberOfSetBit {
    static int numberOfSetBit(int N){
        int count = 0;
        while(N > 0){
            if((N&1) != 0){
                count++;
            }
            N >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(numberOfSetBit(N));
    }
}
