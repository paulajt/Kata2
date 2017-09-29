
package kata2;

import java.util.*;


public class Kata2 {

    
    public static void main(String[] args) {
        int [] data = {1,1,-3,7,7,7,2};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for(int value : data){
            histogram.put(value, histogram.containsKey(value) ? histogram.get(value)+1 : 1);
        }
        
        for (int key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
    
}
