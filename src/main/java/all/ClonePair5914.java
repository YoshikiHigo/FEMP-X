package all;

public class ClonePair5914 {

    int method1(Comparable c1,Comparable c2){
      if (c1 == c2)   return (0);
      if (c1 == null)   return (-1);
      if (c2 == null)   return (1);
      return (c1.compareTo(c2));
    }

    int method2(Comparable a,Comparable b){
      int result;
      if (a != null && b != null) {
        result=a.compareTo(b);
      }
     else   if (a == null && b != null) {
        result=-1;
      }
     else   if (b == null && a != null) {
        result=1;
      }
     else {
        result=0;
      }
      return result;
    }
}
