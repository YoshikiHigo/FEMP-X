package all;

import java.util.Arrays;
import java.util.List;

public class ClonePair4099 {

    boolean method1(String[] test1,String[] test2){
      boolean isEqual=true;
      if (test1.length != test2.length) {
        isEqual=false;
      }
     else {
        for (int i=0; i < test1.length; i++) {
          if (test1[i] != null) {
            if (!test1[i].equals(test2[i])) {
              isEqual=false;
              break;
            }
          }
     else {
            if (test2[i] != null) {
              isEqual=false;
              break;
            }
          }
        }
      }
      return isEqual;
    }

    boolean method2(String[] left,String[] right){
      if (left.length != right.length)   return false;
      List rightValues=Arrays.asList(right);
      for (int i=0; i < left.length; i++) {
        if (!rightValues.contains(left[i]))     return false;
      }
      return true;
    }
}
