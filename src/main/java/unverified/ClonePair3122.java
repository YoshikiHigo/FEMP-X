package unverified;

public class ClonePair3122 {

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
      Integer i1, i2;
      i1=(Integer)o1;
      i2=(Integer)o2;
      if (i1.intValue() == i2.intValue())   return (0);
     else   if (i1.intValue() < i2.intValue())   return (-1);
     else   return (1);
    }
}
