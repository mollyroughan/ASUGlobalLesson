public class JavaLesson {

  public static void main(String[] args) {
  
  String[] cities = {"Boston", "Phoenix", "New York City", "Dallas", "Portland"};
  String[] states = {"MA", "AZ", "NY", "TX", "OR"};
  //String[][] places = {cities, states};

  placesPrint(cities);
  }

  public static void placesPrint (String[] places) {
    //print out all places
  for (int i=0; i<5; i++) { //go through 5 steps: i=0,1,2,3,4
    System.out.println(places[i]);
  }

  System.out.println();

  //print out last 4 places
  for (int i=1; i<5; i++) { //goes through i=1,2,3,4
    System.out.println(places[i]);
  }

  System.out.println();

  //print out all places
  for (int i=0; i<=4; i++) { //go through 5 steps: i=0,1,2,3,4
    System.out.println(places[i]);
  }
  }
}
