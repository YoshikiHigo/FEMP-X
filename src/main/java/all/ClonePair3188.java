package all;

public class ClonePair3188 {

    int method1(Object o1,Object o2){
      String s1=(String)o1;
      int l1=s1.length();
      String s2=(String)o2;
      int l2=s2.length();
      if (l1 > l2)   return 1;
     else   if (l1 < l2)   return -1;
     else   return 0;
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
