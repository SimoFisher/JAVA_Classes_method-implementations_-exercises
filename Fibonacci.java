package fibonacci_esercizio;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {
	
@Override
public Iterator<Integer> iterator()
// Fn=Fn-1 + Fn-2
// F(0)=0,F(1)=1;
{
	// return a new Iterator that has Override all methods inherited
	return new Iterator<Integer>() {
	int sum,f0,n=0;
	int f1=1;
		@Override
		public boolean hasNext() {
		
		
			try
			{
				Math.addExact(f0,f1);
				// Returns the sum of its arguments, 
				// throwing an exception if the result overflows an int.
			}
			catch(ArithmeticException e)
			{
				
				return false;
			}
			return true;
		}
		@Override
		public Integer next()
		{
			
			if(hasNext())
				switch(n)
				{
				case 0:n++;return f0;
				case 1:n++;return f1;
				default: sum=f0+f1;
				         f0=f1;
				         f1=sum;
				         return sum;
				
				}
			return null;
		}
		

			};
}

	public static void main(String[] args) {
		Fibonacci fib=new Fibonacci();
		
		for(Integer i:fib)
			for(Integer j:fib)
				System.out.println(i+" "+j);
	}
	
}
