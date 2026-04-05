package unverified;

public class ClonePair3258 {

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
      Integer i1, i2;
      i1=(Integer)o1;
      i2=(Integer)o2;
      if (i1.intValue() == i2.intValue())   return (0);
     else   if (i1.intValue() < i2.intValue())   return (-1);
     else   return (1);
    }
}
