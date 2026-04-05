package unverified;

public class ClonePair7714 {

    boolean method1(Object value1,Object value2){
      if (value1 == null && value2 == null) {
        return true;
      }
      return value1 != null && value2 != null && value1.equals(value2);
    }

    boolean method2(Object a,Object b){
      if (a == null) {
        return b == null;
      }
     else {
        return b != null && a.equals(b);
      }
    }
}
