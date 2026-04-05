package unverified;

public class ClonePair3091 {

    int method1(Object obj,Object obj1){
      int v1=((Integer)obj).intValue();
      int v2=((Integer)obj1).intValue();
      if (v1 < v2)   return -1;
      if (v1 == v2)   return 0;
      return 1;
    }

    int method2(Object o1,Object o2){
      Integer i1=(Integer)o1;
      Integer i2=(Integer)o2;
      if (i1.intValue() == i2.intValue())   return 0;
     else   if (i1.intValue() < i2.intValue())   return -1;
     else   return 1;
    }
}
