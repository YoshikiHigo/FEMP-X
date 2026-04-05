package all;

public class ClonePair7430 {

    boolean method1(Object own,Object otherObject){
      if (own == otherObject) {
        return true;
      }
      if (otherObject == null || own == null) {
        return false;
      }
      if (own.getClass() != otherObject.getClass()) {
        return false;
      }
      return true;
    }

    boolean method2(Object a,Object b){
      if (a == b)   return true;
     else   if ((a == null) || (b == null))   return false;
     else   return a.getClass() == b.getClass();
    }
}
