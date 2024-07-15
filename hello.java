public class hello {
    public static void main(String args[]){
        
        // //hello world
        // System.out.println("hello world");

        // //variables
        // System.out.println(2+8);
        // int num1=10;
        // int num2 = 18;
        // int result  = num1 + num2;
        // System.out.println(result);


        // //data types
        // // double  sai =  5.6;
        // // float s = 5.6f; // for floast o be considered as decimal f has to be appended
        // // boolean  b = false;
        // // long l = 48934l;


        // //literals
        // // int num = 167;
        // // //binary
        // // int n = 0b101;
        // // //hexadecimal
        // // int npp = 0x101;
        // // int nll = 10_00_00_000;
        // // double n7 = 12e10;
        // // System.out.println(n);
        // // System.out.println(nll);

        // //type conversion and type casting
        // byte by = 127;
        // // int i = 181;
        // // i=by; //but by =i will not work
        // // by = (byte)i;
        // System.out.println(by);

        // // float f = 5.6f;
        // // int in = (int)f;

        // //type promotion
        // // byte a = 10;
        // byte bas=20;
        // // int res = a*bas;
        // // System.out.println(res);

        // //arthemetic operations
        // int n1 =7;
        // int n2 =5;
        // int resultq = n1+n2;
        // System.out.println(resultq);


        // //conditionals
        // int x = 20;
        // if(x<10 && x<=20){
        //     System.out.println("hello bahi 20");
        // }
        // else{
        //     System.out.println("no bhai");
        // }

        // //ternary
        // int sh=0;
        // sh = x%10==0 ? 10 :20;
        // System.out.println(sh);


        // //switch statement
        // int dayOfWeek = 3;
        // String dayName;

        // switch (dayOfWeek) {
        //     case 1:
        //         dayName = "Sunday";
        //         break;
        //     case 2:
        //         dayName = "Monday";
        //         break;
        //     case 3:
        //         dayName = "Tuesday";
        //         break;
        //     case 4:
        //         dayName = "Wednesday";
        //         break;
        //     case 5:
        //         dayName = "Thursday";
        //         break;
        //     case 6:
        //         dayName = "Friday";
        //         break;
        //     case 7:
        //         dayName = "Saturday";
        //         break;
        //     default:
        //         dayName = "Invalid day";
        //         break;
        // }

        // System.out.println("The day of the week is: " + dayName);



        // //while loops
        // int count = 1;
        // while (count <= 5) {
        //     System.out.println("Count is: " + count);
        //     count++;
        // }


        // //do while loop
        // int cnt = 1;

        // do {
        //     System.out.println("Count is: " + count);
        //     cnt++;
        // } while (cnt <= 5);



        // //for loop
        // for(int i=0;i<=4;i++)
		// {
		// 	System.out.println("Hi"+i);
		// }
		
		// ///nested for loop
		// for(int i=1;i<=7;i++)
		// {
		// 	System.out.println("Day"+i);
		// 	for(int j=1;j<=9;j++)
		// 	{
		// 		System.out.println(" "+(j+8)+"-"+(j+9));
		// 	}
		// }
        

        
        // int i=1;
		// for(;i<=5;)
		// {
		// 	System.out.println("DAY"+i);
		// 	i++;
		// }
        

        // // int a,b;
        // // a=b=10;
        // // System.out.println(a);


        int a = 3;

        int b = 6;

        int e = (~a & b) | (a & ~b);

        System.out.println(e);
    }
}
