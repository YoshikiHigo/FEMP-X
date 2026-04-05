package all;

public class ClonePair5909 {

    int method1(Comparable o1,Comparable o2){
      if (o1 == null) {
        if (o2 == null)     return 0;
     else     return 1;
      }
     else   if (o2 == null) {
        if (o1 == null)     return 0;
     else     return -1;
      }
      return o1.compareTo(o2);
    }

    int method2(Comparable c1,Comparable c2){
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
}
