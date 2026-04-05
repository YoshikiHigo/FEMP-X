package unverified;

public class ClonePair3014 {

    int method1(Object o1,Object o2){
      String str1=(String)o1;
      String str2=(String)o2;
      if (str1 == null) {
        if (str2 == null)     return 0;
        return -1;
      }
     else   if (str2 == null) {
        return 1;
      }
      return str1.toLowerCase().compareTo(str2.toLowerCase());
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
