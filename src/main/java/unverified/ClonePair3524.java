package unverified;

public class ClonePair3524 {

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
      String s1=(String)o1;
      String s2=(String)o2;
      if (s1 == null) {
        return s2 == null ? 0 : -1;
      }
     else {
        if (s2 == null) {
          return 1;
        }
     else {
          return s1.compareTo(s2);
        }
      }
    }
}
