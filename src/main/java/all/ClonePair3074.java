package all;

public class ClonePair3074 {

    int method1(Object o1,Object o2){
      String n1=(String)o1;
      String n2=(String)o2;
      n1=n1.toUpperCase();
      n2=n2.toUpperCase();
      int l1=n1.length();
      int l2=n2.length();
      int minLength=Math.min(l1,l2);
      for (int i=0; i < minLength; i++) {
        int a1=n1.charAt(i);
        int a2=n2.charAt(i);
        if (a1 < a2)     return -1;
        if (a1 > a2)     return 1;
      }
      if (minLength == l1 && l1 != l2)   return -1;
     else   if (l1 == l2)   return 0;
      return 1;
    }

    int method2(Object obj1,Object obj2){
      String s1=(String)obj1;
      String s2=(String)obj2;
      if (s1.length() < s2.length()) {
        return -1;
      }
     else   if (s1.length() > s2.length()) {
        return 1;
      }
     else {
        return s1.compareTo(s2);
      }
    }
}
