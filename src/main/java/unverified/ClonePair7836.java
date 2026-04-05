package unverified;

public class ClonePair7836 {

    boolean method1(Object obj1,Object obj2){
      if (obj1 == null)   return (obj2 == null);
      return ((obj2 != null) && obj1.equals(obj2));
    }

    boolean method2(Object object1,Object object2){
      if (object1 == null)   return (object2 == null);
     else   if (object2 == null)   return false;
     else   if (object1 == object2)   return true;
      return object1.equals(object2);
    }
}
