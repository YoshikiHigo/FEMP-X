package all;

public class ClonePair3089 {

    int method1(Object obj,Object obj1){
      int v1=((Integer)obj).intValue();
      int v2=((Integer)obj1).intValue();
      if (v1 < v2)   return -1;
      if (v1 == v2)   return 0;
      return 1;
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
