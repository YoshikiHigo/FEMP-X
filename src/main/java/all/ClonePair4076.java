package all;

import java.util.Arrays;
import java.util.List;

public class ClonePair4076 {

    boolean method1(String[] left,String[] right){
      boolean result=left.length == right.length;
      if (result) {
        for (int i=0; i < left.length; i++) {
          result&=((left[i] == null && right[i] == null) || left[i] != null && left[i].equals(right[i]));
          if (!result) {
            break;
          }
        }
      }
      return result;
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
