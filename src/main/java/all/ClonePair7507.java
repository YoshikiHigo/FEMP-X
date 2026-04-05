package all;

import java.util.*;

public class ClonePair7507 {

    double method1(List<Double> valueList){
      if (valueList.isEmpty()) {
        return 0;
      }
      Double[] valueArray=(Double[])valueList.toArray(new Double[valueList.size()]);
      Arrays.sort(valueArray);
      return valueArray[(int)(0.9 * valueArray.length)];
    }

    double method2(List<Double> list){
      double avg=0;
      if (list.size() == 0)   return 0;
      for (int i=0; i < list.size(); i++) {
        if (!Double.isNaN(list.get(i)) && !Double.isInfinite(list.get(i)))     avg+=list.get(i);
      }
      return avg / list.size();
    }
}
