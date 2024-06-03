package Dictionary;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Set;

public class dictionaryExample {
    //Write a Java program to use Hash Table for storing the
    //custom class objects and use provided functions as Hash
    //Table.
    public static void main(String[] args) {
        Dictionary<String,String> dictionary = new Hashtable<>() ;
        System.out.println("Empty :"+dictionary.isEmpty());
        dictionary.put("Car1","Tesla");
        dictionary.put("Car2","BYD");
        dictionary.put("Car3","BMW");
        dictionary.put("Car4","Nexus");
        dictionary.put("Car6","ROLL_ROYEC");
        dictionary.put("Car5","IONIQ");
        System.out.println("Initial dictionary:"+dictionary);
        System.out.println("Size:"+dictionary.size());
        System.out.println("Empty:"+dictionary.isEmpty());
        //remove the hashtable entry with car 3
        dictionary.remove("Car3");
        System.out.println("using get:"+dictionary.get("Car1"));
        System.out.println("using get:"+dictionary.get("Car10"));
        //the getOrDefault() method gets value from the key if exist . if not exist, gives default value
      //  System.out.println(dictionary.getOrDefault("Car5","Not found in the dictionary"));
       // System.out.println(dictionary.getOrDefault("Car3","Not found in the dictionary"));
        System.out.println("Current Hashtable:"+dictionary);

        //putIfAbsent() method insert value in provided key if not found
        //dictionary.putIfAbsent("Car2","SujanLama");
        //dictionary.putIfAbsent("Car7","jamunaLama");
        //System.out.println("Updated HashTable:"+hashtable);

        //traversal of hashtable
        //use keySet() for getting keySet of hashtable and storing in a new set
        //Set<String> keySet = dictionary.keySet();
        //Iterate through the hashtable object using for-each loop
        //for (String key : keySet){
            //print and display the roll No and student name
        //    System.out.println("Key :"+key+"\t|\t Car Name:"+dictionary.get(key));
        //}
        System.out.println("Empty :"+dictionary.isEmpty());
       // hashtable.clear();
        System.out.println("Size :"+dictionary.size());
        System.out.println("Empty:"+dictionary.isEmpty() );

    }
}
