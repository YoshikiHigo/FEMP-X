package all;

import java.util.*;

public class ClonePair7330 {

    double method1(Vector v){
      double sum=0;
      Iterator it=v.iterator();
      while (it.hasNext()) {
        Double val=(Double)it.next();
        sum+=val.doubleValue();
      }
      return sum;
    }

    double method2(Vector values){
      double total=0;
      for (int i=0; i < values.size(); i++) {
        total+=((Double)values.elementAt(i)).doubleValue();
      }
      return (total / values.size());
    }
}
