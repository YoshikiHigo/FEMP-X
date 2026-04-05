package all;

public class ClonePair3084 {

    int method1(Object obj,Object obj1){
      int v1=((Integer)obj).intValue();
      int v2=((Integer)obj1).intValue();
      if (v1 < v2)   return -1;
      if (v1 == v2)   return 0;
      return 1;
    }

    int method2(Object arg0,Object arg1){
      int k0=((Integer)arg0).intValue();
      int k1=((Integer)arg1).intValue();
      if (k0 < k1)   return -1;
     else   if (k0 > k1)   return 1;
      return 0;
    }
}
