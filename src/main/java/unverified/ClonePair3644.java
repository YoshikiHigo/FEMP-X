package unverified;

public class ClonePair3644 {

    int method1(Object o1,Object o2){
      Number n1=(Number)o1;
      Number n2=(Number)o2;
      double r=(n1.doubleValue() - n2.doubleValue());
      if (r == 0) {
        return 0;
      }
      if (r > 0) {
        return 1;
      }
     else {
        return -1;
      }
    }

    int method2(Object o1,Object o2){
      Integer i1=(Integer)o1;
      Integer i2=(Integer)o2;
      if (i1.intValue() < i2.intValue()) {
        return -1;
      }
     else   if (i1.intValue() == i2.intValue()) {
        return 0;
      }
      return 1;
    }
}
