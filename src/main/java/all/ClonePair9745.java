package all;

import java.util.*;

public class ClonePair9745 {

    int method1(int[] values){
      if (values == null || values.length == 0) {
        return 0;
      }
      int min=values[0];
      for (int i=1; i < values.length; i++) {
        if (min > values[i]) {
          min=values[i];
        }
      }
      return min;
    }

    int method2(int[] array){
      if (null == array || array.length == 0)   return 0;
      Arrays.sort(array);
      return array[0];
    }
}
