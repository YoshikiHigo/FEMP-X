package unverified;

import java.util.*;

public class ClonePair8775 {

    double method1(ArrayList<Double> l){
      double accum=0d;
      for (int i=0; i < l.size(); i++) {
        accum+=l.get(i);
      }
      return accum / l.size();
    }

    double method2(ArrayList<Double> values){
      double sum=0;
      for (int i=0; i < values.size(); i++) {
        sum=sum + (values.get(i)).doubleValue();
      }
      return sum / values.size();
    }
}
