package all;

public class ClonePair3120 {

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

    int method2(Object arg0,Object arg1){
      int k0=((Integer)arg0).intValue();
      int k1=((Integer)arg1).intValue();
      if (k0 < k1)   return -1;
     else   if (k0 > k1)   return 1;
      return 0;
    }
}
