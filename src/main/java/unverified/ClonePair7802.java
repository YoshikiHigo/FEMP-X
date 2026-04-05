package unverified;

public class ClonePair7802 {

    boolean method1(Object o1,Object o2){
      if (o1 == null)   return o2 == null;
     else   return o2 != null && o1.equals(o2);
    }

    boolean method2(Object object1,Object object2){
      if (object1 == null)   return (object2 == null);
     else   if (object2 == null)   return false;
     else   if (object1 == object2)   return true;
      return object1.equals(object2);
    }
}
