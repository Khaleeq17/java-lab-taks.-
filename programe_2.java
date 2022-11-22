

//A program which shows your veriable stores even/odd number

import java.util.Scanner;
class Evenodd{
public static void main(String[] org)
{
int number;

Scanner obj=new Scanner(System.in);
System.out.println("Enter a number to check weather it is Even or Odd");
number=obj.nextInt();
if(number%2==0){
System.out.println("Number is even ");
}
else{
System.out.println("Number is odd ");
}
}
}

