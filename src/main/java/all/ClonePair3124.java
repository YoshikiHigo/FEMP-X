package all;

public class ClonePair3124 {

    int method1(Object sp1,Object sp2){
      Integer a=(Integer)sp1;
      Integer b=(Integer)sp2;
      if (a.intValue() < b.intValue()) {
        return -1;
      }
     else   if (a.intValue() == b.intValue()) {
        return 0;
      }
     else   if (a.intValue() > b.intValue()) {
        return 1;
      }
      return -2;
    }

    int method2(Object o1,Object o2){
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
}
