package all;

public class ClonePair5908 {

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
