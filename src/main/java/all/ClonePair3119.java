package all;

public class ClonePair3119 {

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
      Integer iobj=(Integer)o1;
      int i1=iobj;
      iobj=(Integer)o2;
      int i2=iobj;
      if (i1 > i2)   return 1;
     else   if (i1 < i2)   return -1;
     else   return 0;
    }
}
