package all;

public class ClonePair3868 {

    boolean method1(Double[] o1,Double[] o2){
      for (int i=3; i < o1.length; i++) {
        if (o1[i] == null || o2[i] == null || (o1[i] == Double.MIN_VALUE) || (o2[i] == Double.MIN_VALUE))     return false;
        if (o1[i] > o2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(Double[] o1,Double[] o2){
      for (int i=3; i < o1.length; i++) {
        if (o1[i] == null || o2[i] == null || (o1[i] == Double.MIN_VALUE) || (o2[i] == Double.MIN_VALUE))     return false;
        if (!o1[i].equals(o2[i])) {
          return false;
        }
      }
      return true;
    }
}
