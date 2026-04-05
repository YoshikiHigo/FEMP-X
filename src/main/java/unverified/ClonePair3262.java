package unverified;

public class ClonePair3262 {

    int method1(Object o1,Object o2){
      Integer iobj=(Integer)o1;
      int i1=iobj;
      iobj=(Integer)o2;
      int i2=iobj;
      if (i1 > i2)   return 1;
     else   if (i1 < i2)   return -1;
     else   return 0;
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
