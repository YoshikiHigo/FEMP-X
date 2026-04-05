package all;

import java.util.*;

public class ClonePair7503 {

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
