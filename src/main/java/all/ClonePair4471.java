package all;

import java.util.Map;

public class ClonePair4471 {

    int method1(Object obj,Map freqMap){
      Integer count=(Integer)freqMap.get(obj);
      if (count != null) {
        return count.intValue();
      }
      return 0;
    }

    int method2(Object obj,Map freqMap){
      Integer count=(Integer)freqMap.get(obj);
      if (count != null) {
        return count;
      }
      return 0;
    }
}
