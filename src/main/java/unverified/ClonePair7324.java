package unverified;

import java.util.*;

public class ClonePair7324 {

    double method1(Vector v){
      if (v.isEmpty())   return Double.NaN;
      double tot=0.0D;
      for (  Object aV : v) {
        tot+=(Double)aV;
      }
      return tot;
    }

    double method2(Vector values){
      double total=0;
      for (int i=0; i < values.size(); i++) {
        total+=((Double)values.elementAt(i)).doubleValue();
      }
      return (total / values.size());
    }
}
