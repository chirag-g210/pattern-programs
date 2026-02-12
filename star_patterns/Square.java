
import java.util.*;

public class Square{
    public static void squarePattern(int n){
        for(int i = 0 ; i < n+1 ; i++){
            for(int j = 0 ; j < n+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //side of square..
        squarePattern(n);
    }
}

/*
sample output for n = 5 
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *

*/
