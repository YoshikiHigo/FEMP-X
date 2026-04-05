package unverified;

public class ClonePair11347 {

    int method1(Integer i1,Integer i2){
      if (i1 == null) {
        return i2 == null ? 0 : -1;
      }
     else   if (i2 == null) {
        return 1;
      }
      return i1.intValue() < i2.intValue() ? -1 : i1.intValue() > i2.intValue() ? 1 : 0;
    }

    int method2(Integer o1,Integer o2){
      if (o1 == o2)   return 0;
      if (o1 == null)   return -1;
      if (o2 == null)   return 1;
      if (o1.intValue() < o2.intValue())   return -1;
      if (o1.intValue() > o2.intValue())   return 1;
      return 0;
    }
}
