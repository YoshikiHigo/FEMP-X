package all;

import java.util.*;

public class ClonePair7489 {

    double method1(List<Double> liste){
      if (liste.isEmpty()) {
        return 0.0;
      }
      Double[] listeTriee=liste.toArray(new Double[0]);
      java.util.Arrays.sort(listeTriee);
      return listeTriee[liste.size() / 2].doubleValue();
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
