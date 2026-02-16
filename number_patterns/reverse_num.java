import java.util.*;
public class reverse_num {
    public static void pattern(int n){
        for(int i = 1 ; i <= n; i++){
            for(int j = 1; j <=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for reverse pattern: ");
        int n = sc.nextInt();
        pattern(n);
    }
}


/*
    output sample for number n = 5
        1 2 3 4 5 
        1 2 3 4
        1 2 3
        1 2
        1
    */
