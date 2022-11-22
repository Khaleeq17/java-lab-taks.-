


//Create a program in which user is asked for marks in a respected way
//(metriculation, intermediate and test result) where output would be the CPN



import java.util.Scanner;
class cpn{
public static void main(String[] org)
{
int metriculation;
int intermediate;
int test_score;
double cpn;
Scanner obj=new Scanner(System.in);
System.out.println("Enter Metriculation Marks in percentage:");
metriculation=obj.nextInt();

System.out.println("Enter Intermediate Marks in percentage:");
intermediate=obj.nextInt();


System.out.println("Enter Test score Marks:");
test_score=obj.nextInt();

cpn=(metriculation/850)*10 + (intermediate/1100)*30 + (test_score/100)*60;


System.out.println("Cpn is:"+(cpn));


}
}