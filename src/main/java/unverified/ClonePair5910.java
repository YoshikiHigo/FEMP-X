package unverified;

public class ClonePair5910 {

    int method1(Comparable c1,Comparable c2){
      if (c1 == null) {
        if (c2 == null) {
          return 0;
        }
     else {
          return 1;
        }
      }
     else   if (c2 == null) {
        return -1;
      }
     else {
        return c1.compareTo(c2);
      }
    }

    int method2(Comparable a,Comparable b){
      if (a != null && b != null) {
        return a.compareTo(b);
      }
     else   if (a != null) {
        return -1;
      }
     else   if (b != null) {
        return 1;
      }
      return 0;
    }
}
