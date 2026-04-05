package all;

import java.util.*;

public class ClonePair7517 {

    double method1(List<Double> list){
      double avg=0;
      if (list.size() == 0)   return 0;
      for (int i=0; i < list.size(); i++) {
        if (!Double.isNaN(list.get(i)) && !Double.isInfinite(list.get(i)))     avg+=list.get(i);
      }
      return avg / list.size();
    }

    double method2(List<Double> liste){
      if (liste.isEmpty()) {
        return 0.0;
      }
      double somme=0.0;
      for (  Double val : liste) {
        somme+=val.doubleValue();
      }
      return somme / liste.size();
    }
}
