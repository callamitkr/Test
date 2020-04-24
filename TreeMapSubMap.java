package com.amit;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapSubMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(); 
		Map<Integer, String> map = new HashMap<Integer, String>(); 
       // Mapping string values to int keys 
       treeMap.put(10, "Geeks"); 
       treeMap.put(15, "4"); 
       treeMap.put(20, "Geeks");
       treeMap.put(11, "Patna");
       treeMap.put(25, "Welcomes"); 
       treeMap.put(30, "You"); 
       // Displaying the TreeMap 
       System.out.println("The original map is: "+ treeMap); 
      // SortedMap<Integer, String> sortedMap = treeMap.subMap(15,30); 
     map=  treeMap.subMap(15,30); 
    
     map.put(17,"Ram");
      // sortedMap.put(17,"Ram");
      // sortedMap.remove(20);
       // Displaying the submap 
      // System.out.println("The subMap is " + sortedMap); 
     System.out.println("The subMap is " + map); 
       System.out.println("The tree map after add is " + treeMap); 
       
    // Creating an empty TreeMap 
       TreeMap<String, Integer> treeMap1 = 
                new TreeMap<String, Integer>(); 
 
       // Mapping int values to string keys 
       treeMap1.put("Geeks", 10); 
       treeMap1.put("4", 15); 
       treeMap1.put("Geeks", 20); 
       treeMap1.put("Welcomes", 25); 
       treeMap1.put("You", 30); 
 
       // Displaying the TreeMap 
     // System.out.println("The original map is: "                     + treeMap1); 
 
       // Displaying the subMap 
    //   System.out.println("The subMap is " +           treeMap1.subMap("Geeks", "You")); 
   } 

	

}
