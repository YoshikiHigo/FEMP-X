package all;

public class ClonePair3796 {

    int method1(Double d1,Double d2){
      if (d1 == null) {
        return d2 == null ? 0 : -1;
      }
     else   if (d2 == null) {
        return 1;
      }
      return d1.doubleValue() < d2.doubleValue() ? -1 : d1.doubleValue() > d2.doubleValue() ? 1 : 0;
    }

    int method2(Double o1,Double o2){
      if (o1 == o2)   return 0;
      if (o1 == null)   return -1;
      if (o2 == null)   return 1;
      if (o1.doubleValue() < o2.doubleValue())   return -1;
      if (o1.doubleValue() > o2.doubleValue())   return 1;
      return 0;
    }
}
