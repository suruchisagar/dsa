import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int[] arr= new int[x];
        for(int i=0; i<x; i++){
            int val=sc.nextInt();
            arr[i]=val;
        }
        for(int j=0; j<x; j++){
            System.out.println(arr[j]);
        }
    }
}

