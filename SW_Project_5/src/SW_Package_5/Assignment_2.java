package SW_Package_5;

public class Assignment_2 
{ 
	 public int multi(int a, int b) // Method to multiply two integers - Returns result - NON-VOID
	  { int c;
	    c=a*b;
	    System.out.println("Multiplied result is:"+c);
	    return c;	 
	  }
		
	 public int subtract(int c, int d) // Method to subtract one integer from another - Returns result - NON-VOID
	  { int e;
	    e=c-d;
	    System.out.println("Subtract result is:"+e);
	    return e;	 
	  }
		
	 public int sum(int f, int g) // Method to add two integers - Returns result - NON-VOID 
	 { int h;
	   h=f+g;
	   System.out.println("Sum result is:"+h);
	   return h;	 
	 }
		
	 public int div(int i, int j) // Method to divide two integers - Result not returned - VOID 
	 { int k;
	   k=i/j;
	   System.out.println("Final result is:"+k);
	   return k;	 
	 }	
		
	public static void main(String[] args) // Main Method 
	{Assignment_2 two = new Assignment_2(); // Creation of class object 
	int multresult = two.multi(10,2); // Call multi method and store returned result in multresult
	int subresult_1 = two.subtract(multresult,2); // Call subtract method and store returned result in subresult_1
	int subresult_2 = two.subtract(subresult_1,2); // Call subtract method again and store returned result in subresult_2
	int sumresult = two.sum(subresult_2,2);// Call sum method and store returned result in sumresult
	two.div(sumresult,2);// Call div method
	}		
	}


