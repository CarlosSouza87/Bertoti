package exercicio5;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class FindDups {
	 static final Comparator<String> IGNORE_CASE_ORDER
     = new Comparator<String>() {
 public int compare(String s1, String s2) {
     return s1.compareToIgnoreCase(s2);
 }
};

public static void main(String[] args) {
 
 SortedSet<String> s = new TreeSet<String>(IGNORE_CASE_ORDER);
 for (String a : args) {
     s.add(a);
 }
 System.out.println(s.size() + " distinct words: " + s);
}
}
