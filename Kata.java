import java.util.ArrayList;
import java.util.List;



public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    // Your code here
    List<Integer> result = new ArrayList<>();
    
    for(int i = 0; i < a.length; i++) {
      boolean foundInB = false;
      for(int j = 0; j < b.length; j++) {
        if(a[i] == b[j]) {
          foundInB = true;
          break;
        }
      }
      
      
      if(!foundInB) {
        result.add(a[i]);
      }
    }
    
    int[] finalResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }

        return finalResult;
    
  }
}