package all;

public class ClonePair3278 {

    int method1(Object arg0,Object arg1){
      int k0=((Integer)arg0).intValue();
      int k1=((Integer)arg1).intValue();
      if (k0 < k1)   return -1;
     else   if (k0 > k1)   return 1;
      return 0;
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
