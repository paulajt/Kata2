
package kata2;

import java.util.*;


public class Kata2 {

    
    public static void main(String[] args) {
        int [] data = {1,1,-3,7,7,7,2};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for(int i= 0; i< data.length; i=i+1){
            if (histogram.containsKey(i)) {
                histogram.put(data[i],histogram.get(data[i])+1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        
        for (int key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
    
}
