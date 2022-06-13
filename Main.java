import java.util.*;

class Main {
  public static void main(String[] args) {
  
    Scanner it = new Scanner(System.in);

    ArrayList<String> lastNames = new ArrayList<String>();
    lastNames.add("Swift");
    lastNames.add("Park");
    lastNames.add("Kim");
    System.out.println(lastNames);

    lastNames.add(1, "Lee");
    System.out.println("\n" + lastNames);
    System.out.println("Size of lastNames is " + + lastNames.size());

    System.out.println("\nString removed is " + lastNames.remove(2));
    System.out.println(lastNames);
    System.out.println("Size of lastNames is " + + lastNames.size());

    System.out.println("\nRemoved String using set is " + lastNames.set(0, "Jeong"));
    System.out.println(lastNames);
    System.out.println("Size of lastNames is " + + lastNames.size());

    //lastNames.clear();
    //System.out.println("\n" + lastNames);
    //System.out.println("Size of lastNames is " + lastNames.size());

    Integer one = new Integer(1);
    Double two = new Double(2.0);
    String three = "3";
    //lastNames.add(one);
    //lastNames.add(two);
    //lastNames.add(three);

    ArrayList demo = new ArrayList();
    demo.add(one);
    demo.add(two);
    demo.add(three);
    System.out.println("\n" + demo);

    //Traversals start here
    System.out.println();

    for(int i = 0; i < lastNames.size(); i++)
    {
      System.out.println("Item " + (i + 1) + ": " + lastNames.get(i));
    }
    
    System.out.println();

    for(int i = lastNames.size() - 1; i >= 0; i--)
    {
      System.out.println("Item " + (i + 1) + ": " + lastNames.get(i));
    }

    System.out.println();
    lastNames.add("Wang");
    lastNames.add("Huang");
    lastNames.add("Osaki");

    for(String x : lastNames)
    {
      System.out.println(x);
    }

    System.out.println();

    ArrayList<String> letters = new ArrayList<String>();
    letters.add("J");
    letters.add("K");
    letters.add("L");
    letters.add("M");
    letters.add("N");
    letters.add("O");

    for(int i = 0; i < letters.size(); i++)
    {
      for(int j = 0; j < lastNames.size(); j++)
      {
        if(letters.get(i).equals(lastNames.get(j).substring(0, 1)))
        {
          System.out.println(lastNames.get(j) + " starts with " + letters.get(i));
        }
      }
    }

  }
}