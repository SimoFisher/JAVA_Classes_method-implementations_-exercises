package file_java;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test_stream_Example1 {
public static void main(String[] args) {
	 Supplier<Stream <String>> stringSupplier= ()->Stream.of("z", "f","b","a").filter(s -> s.startsWith("a"));
	 System.out.println(stringSupplier.get().anyMatch(s->true));
	 // The stringSupplier is a Supplier that get a Stram of Strings, and return True
	 // if there is a match with the filter() function
	 System.out.println(stringSupplier.get().noneMatch(s->true));
	// returns true if every x is different from other elements x_1,x_2..x_n for all elements
}
}
