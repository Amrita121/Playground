import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int b = in.nextInt();
       int e = in.nextInt();
       System.out.println(power_of_digits(b,e));
	    // Take numbers from 2 to given number
	    // Check each number until it reaches the given number
	    /*for(int i = 2; i <= n; i++)
	    {
	        if(is_prime(i))// Function call
	        {
	            System.out.println(i);
	        }
	    }
	    
	}
	// Function to find the prime number*/
    }
	public static int power_of_digits(int b,int e)
	{
      int p=1;
      while(e>=1)
      {
        p=p*b;
        e--;
	    
	    }
	    return p;
	}
}