package HashTable;

import java.util.Hashtable;
import java.util.Set;

public class hashTableExample {
    /*Write a Java program to use Hash Table for storing the custom class objects and use
following functions:
- put()
- putIfAbsent()
- remove()
- getOrDefault()
- get()
- isEmpty()
- keys()
- get()
- clear()
- size()
*/
    public static void main(String[] args) {
        Hashtable<String,String> hashtable = new Hashtable<>();
        System.out.println("Empty :"+hashtable.isEmpty());
        hashtable.put("Car1","Tesla");
        hashtable.put("Car2","BYD");
        hashtable.put("Car3","BMW");
        hashtable.put("Car4","Nexus");
        hashtable.put("Car6","ROLL_ROYEC");
        hashtable.put("Car5","IONIQ");
        System.out.println("Initial Hashtable:"+hashtable);
        System.out.println("Size:"+hashtable.size());
        System.out.println("Empty:"+hashtable.isEmpty());
        //remove the hashtable entry with car 3
        hashtable.remove("Car3");
        System.out.println("using get:"+hashtable.get("Car1"));
        System.out.println("using get:"+hashtable.get("Car10"));
        //the getOrDefault() method gets value from the key if exist . if not exist, gives default value
        System.out.println(hashtable.getOrDefault("Car5","Not found in the hashtable"));
        System.out.println(hashtable.getOrDefault("Car3","Not found in the hashtable"));
        System.out.println("Current Hashtable:"+hashtable);

        //putIfAbsent() method insert value in provided key if not found
        hashtable.putIfAbsent("Car2","SujanLama");
        hashtable.putIfAbsent("Car7","jamunaLama");
        System.out.println("Updated HashTable:"+hashtable);

        //traversal of hashtable
        //use keySet() for getting keySet of hashtable and storing in a new set
        Set<String> keySet = hashtable.keySet();
        //Iterate through the hashtable object using for-each loop
        for (String key : keySet){
            //print and display the roll No and student name
            System.out.println("Key :"+key+"\t|\t Car Name:"+hashtable.get(key));
        }
        System.out.println("Empty :"+hashtable.isEmpty());
        hashtable.clear();
        System.out.println("Size :"+hashtable.size());
        System.out.println("Empty:"+hashtable.isEmpty() );
    }

}
