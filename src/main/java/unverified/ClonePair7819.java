package unverified;

public class ClonePair7819 {

    boolean method1(Object a,Object b){
      if (a == null) {
        return b == null;
      }
     else {
        return b != null && a.equals(b);
      }
    }

    boolean method2(Object object1,Object object2){
      if (object1 == null)   return (object2 == null);
     else   if (object2 == null)   return false;
     else   if (object1 == object2)   return true;
      return object1.equals(object2);
    }
}
