package file_java;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class TreeMap_method {
	private Map<String,Integer> mapping=new TreeMap<String,Integer>();
	// Rememeber that Map, is a interface that is member of the Java Collections Framework.
	// I create a new Object of TreeMap type,The map is sorted according to the natural ordering of its keys, or by a Comparator
	// for each key(unique without repetitions) I can have one element ,but same elements can be associeted to different keys
	public TreeMap_method (File file) throws IOException
	{
		Scanner scanner=new Scanner(file); // creating new scanner, creation of new scanners, which takes an input file read from directory.txt
		
		while(scanner.hasNext())
		{
			String word=scanner.next();
			Integer freq=mapping.get(word);
			
			
			if(freq==null) mapping.put(word, 1);
			else mapping.put(word, freq+1);
			 System.out.println(mapping);
			
		}
		System.out.println();
		String s="{";
		for(String chiave:mapping.keySet())
			s+=chiave+"="+mapping.get(chiave)+" ,";
		s+="}";
		System.out.println("TreeMap"+s);
		// in this loop I use the KeySet method where you see the order and where there are no repetitions
		     // a,b,c,d,e //-> that is, it follows the natural ordering of the alphabet
		
		
	}
	public static void main(String[] args) throws IOException {
		File file=new File("/Directory/name_file.txt");
        // reference to the Constructor of FIle Class file, which accepts txt files as input, which I add by
        // placing its position between the "", as if it were a string
		TreeMap_method OB=new TreeMap_method(file);
		
	}
	
	
}
