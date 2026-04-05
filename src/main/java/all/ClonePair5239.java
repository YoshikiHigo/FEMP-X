package all;

import java.util.*;

public class ClonePair5239 {

    int method1(Vector<Double> v,double x){
      if (v == null)   return -1;
      for (int j=1; j < v.size(); j++) {
        if (v.get(j) < x)     return j;
      }
      return v.size() - 1;
    }

    int method2(Vector<Double> v,double x){
      if (v == null)   return -1;
      for (int j=1; j < v.size(); j++) {
        if (v.get(j) > x)     return j;
      }
      return v.size() - 1;
    }
}
