package unverified;

public class ClonePair5913 {

    int method1(Comparable c1,Comparable c2){
      if (c1 == c2)   return (0);
      if (c1 == null)   return (-1);
      if (c2 == null)   return (1);
      return (c1.compareTo(c2));
    }

    int method2(Comparable a,Comparable b){
      if ((a == null) || (b == null)) {
        if (a == b) {
          return 0;
        }
        if (a == null) {
          return -1;
        }
        return 1;
      }
      return a.compareTo(b);
    }
}
