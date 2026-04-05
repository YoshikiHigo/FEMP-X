package all;

public class ClonePair5262 {

    boolean method1(Comparable object1,Comparable object2){
      if (object1 == null) {
        return (object2 == null);
      }
     else   if (object2 == null) {
        return false;
      }
      return (object1.compareTo(object2) == 0);
    }

    boolean method2(Comparable o1,Comparable o2){
      if (o1 == null) {
        if (o2 == null) {
          return true;
        }
     else {
          return false;
        }
      }
     else {
        if (o2 == null) {
          return false;
        }
     else {
          return o1.compareTo(o2) == 0;
        }
      }
    }
}
