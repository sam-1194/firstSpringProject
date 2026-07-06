package listSorting;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {
  public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<String>();
    name.add("Mohit");
    name.add("Sam");
    name.add("Ande");
    name.add("Roy");

    Collections.sort(name);  // Sort cars

    for (String i : name) {
      System.out.println(i);
    }
  }
}
