package all;

public class ClonePair3288 {

    int method1(Object arg0,Object arg1){
      int k0=((Integer)arg0).intValue();
      int k1=((Integer)arg1).intValue();
      if (k0 < k1)   return -1;
     else   if (k0 > k1)   return 1;
      return 0;
    }

    int method2(Object o1,Object o2){
      Integer i1=(Integer)o1;
      Integer i2=(Integer)o2;
      if (i1.intValue() == i2.intValue())   return 0;
     else   if (i1.intValue() < i2.intValue())   return -1;
     else   return 1;
    }
}
