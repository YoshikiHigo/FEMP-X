package all;

public class ClonePair3525 {

    int method1(Object o1,Object o2){
      String s1=(String)o1;
      String s2=(String)o2;
      if (s1 == null) {
        return s2 == null ? 0 : -1;
      }
     else {
        return s2 == null ? 1 : s1.compareTo(s2);
      }
    }

    int method2(Object o1,Object o2){
      String s1;
      String s2;
      if ((o1 == null) && (o2 == null))   return 0;
     else   if (o1 == null)   return -1;
     else   if (o2 == null)   return +1;
      s1=(String)o1;
      s2=(String)o2;
      return s1.toLowerCase().compareTo(s2.toLowerCase());
    }
}
