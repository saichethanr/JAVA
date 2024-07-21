package userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class userinput_intro {
    public static void main(String[] args) throws IOException {
        //in the system class out is the static variable 
        System.out.println();
        
        //gives the ascii value of the number entered
        //it will fail for multiple characters
        int num = System.in.read();
        System.out.println(num);
        System.out.println(num-48);


        //buffer reader
        //belongs to the io pacage
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int n = Integer.parseInt(bf.readLine());
        System.out.println(n);
        bf.close();


        //Scanner
        Scanner inp = new Scanner(System.in);
        int nam = inp.nextInt();
        System.out.println(nam);


    }
}
