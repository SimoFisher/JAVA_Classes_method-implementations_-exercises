package file_java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Test_stream_Example2 {
	public static <T> void main(String[] args) {
		
		Runnable r=()->{System.out.println("Hello Lambda Expression!!");};
		r.run();
		
		
		List<String> lt=Arrays.asList("wer","awegg","rotos");
		lt.stream().filter(s->s.startsWith("a")).forEach(System.out::println);
		// stream example opens and closes a session with operations at the end
		// filter strings and print the word starting with a in ful
		
		
		Predicate<String> startWithJ=s->s.startsWith("J");
		// I create a Predicate , a class that return a boolean value, in this case the condition in expressed by the Lambda
		Predicate<String> fourLetterLong=s->s.length()==4; // Second condition to put && s.startsWith().
		List<String> list=Arrays.asList("Java","ascala","lips");
		list.stream().filter(startWithJ.and(fourLetterLong)).forEach(x->System.out.println("starts with 'J' and has 4 characters : "+x));
		/*
		Finally I'm going open and close a stream with both conditions and Print if are True.
		forEach(x->System.out.println()
		Is a @FunctionalInterface consumer that can be used as an assignment to a lambda expression
		*/
		
		  List<String> l= Arrays.asList("suka","barbaro","samurai","ramarro");
		  l.stream().sorted().filter(s->s.startsWith("s")).forEach(System.out::println);
		// Another Example of Stream , that also get out a sorted() method which on strings follows
		   // an alphabetic logic on the position of the characters
		  

		    
		  
}
}
