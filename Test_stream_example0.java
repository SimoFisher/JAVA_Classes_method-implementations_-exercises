package file_java;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test_stream_example0 {
public static void main(String[] args) {
	IntStream.range(0, 10).filter(n->n%2==0).forEach(System.out::println);
	// I create a Stream of Integers with a range, to which I pass a Lambda expression, which limits the operation on peers, after print each values
	
	 Arrays.stream(new int [] {1,2,3} ).map(n-> 2*n+1).average().ifPresent(System.out::println);
	// I open a stream of Arrays passing a new array of int and limiting with a map function associated with a Lambda, that return the averange of Lambda Expression, after Print
	
	 System.out.println();
	 Stream<Integer> numbers =Stream.iterate(0,n->n+10);// Stram of Integers and iterate on n, such as in the Lambda
	 numbers.limit(5).forEach(System.out::println);
	 Stream<Integer> number = Stream.iterate(0, n -> n < 100, n -> n+10); 
	// another example of iterating over integers with Stream+Lamba, which can put conditions on a function. 
	 number.forEach(System.out::println);
	 // Note the Lambda opens and closes the information, In this case I have I created another Stream to which I pass the results
	 // but in generally using a stream-specific syntax it is no longer possible to recover the result after the closure of a stream, at most I can create
		// a method, that I can call that reuses the Stream with the Lambda expression
}
}
