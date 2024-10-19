package SW_Package_5;

public class Assignment_1
{ 
 public int sum(int a, int b) // Method to add two integers - Returns result - NON-VOID
  { int c;
    c=a+b;
    System.out.println("Sum result is:"+c);
    return c;	 
  }
	
 public int subtract(int c, int d) // Method to subtract one integer from another - Returns result - NON-VOID
  { int e;
    e=c-d;
    System.out.println("Subtract result is:"+e);
    return e;	 
  }
	
 public int multi(int f, int g) // Method to multiply two integers - Returns result - NON-VOID 
 { int h;
   h=f*g;
   System.out.println("Multplicated result is:"+h);
   return h;	 
 }
	
 public int div(int i, int j) // Method to divide two integers - Result not returned - VOID 
 { int k;
   k=i/j;
   System.out.println("Final result is:"+k);
   return k;	 
 }	
	
public static void main(String[] args) //Main Method 
{Assignment_1 one = new Assignment_1(); // Creation of class object 
int sumresult_1 = one.sum(10,2); // Call sum method and store returned result in sumresult
int subresult = one.subtract(sumresult_1,2); // Call subtract method and store returned result in subresult
int sumresult_2 = one.sum(subresult,2); // Call sum method again and store returned result in sumresult_2
int multresult = one.multi(sumresult_2,2);// Call multi method and store returned result in multresult
one.div(multresult,2);// Call div method
}		
}
