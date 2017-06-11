package Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_test {
    
    public static void main(String[] args) throws IOException {
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        for(int i = 2; i <= a; i++){
            if(i == a){
                System.out.println(a + " is a prime number");
            } else {
                if (a % 2 == 0) {
                    System.out.println(a + " is not a prime number");
                    break;
                }
            }
        }
    }   
}

######
Input:
2

######
Output:
2 is a prime number
BUILD SUCCESSFUL (total time: 10 seconds)
