package all;

public class ClonePair8150 {

    int method1(Float f1,Float f2){
      if (f1 == null) {
        return f2 == null ? 0 : -1;
      }
     else   if (f2 == null) {
        return 1;
      }
      return f1.floatValue() < f2.floatValue() ? -1 : f1.floatValue() > f2.floatValue() ? 1 : 0;
    }

    int method2(Float o1,Float o2){
      if (o1 == o2)   return 0;
      if (o1 == null)   return -1;
      if (o2 == null)   return 1;
      if (o1.floatValue() < o2.floatValue())   return -1;
      if (o1.floatValue() > o2.floatValue())   return 1;
      return 0;
    }
}
