package all;

public class ClonePair3083 {

    int method1(Object obj,Object obj1){
      int v1=((Integer)obj).intValue();
      int v2=((Integer)obj1).intValue();
      if (v1 < v2)   return -1;
      if (v1 == v2)   return 0;
      return 1;
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
