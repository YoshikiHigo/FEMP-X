package all;

import java.util.*;

public class ClonePair7500 {

    double method1(List<Double> values){
      double sum=0.0;
      int cnt=0;
      if (values.size() == 0)   return 0.0;
      for (  Double value : values) {
        sum+=value;
        cnt++;
      }
      return sum / cnt;
    }

    double method2(List<Double> valueList){
      if (valueList.isEmpty()) {
        return 0;
      }
      Double[] valueArray=(Double[])valueList.toArray(new Double[valueList.size()]);
      Arrays.sort(valueArray);
      return valueArray[(int)(0.9 * valueArray.length)];
    }
}
