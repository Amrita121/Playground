import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    n=((n%100)%10)*100+((n%100)/10)*10+(n/100);
    System.out.println(n);
    
  }
}