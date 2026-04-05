package unverified;

public class ClonePair3499 {

    int method1(Object o1,Object o2){
      Integer i1, i2;
      i1=(Integer)o1;
      i2=(Integer)o2;
      if (i1.intValue() == i2.intValue())   return (0);
     else   if (i1.intValue() < i2.intValue())   return (-1);
     else   return (1);
    }

    int method2(Object o1,Object o2){
      Integer i1=(Integer)o1;
      Integer i2=(Integer)o2;
      if (i1.intValue() == i2.intValue())   return 0;
     else   if (i1.intValue() < i2.intValue())   return -1;
     else   return 1;
    }
}
