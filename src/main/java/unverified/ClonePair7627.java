package unverified;

public class ClonePair7627 {

    boolean method1(Object o1,Object o2){
      if (o1 == null && o2 == null)   return true;
      if (o1 == null || o2 == null)   return false;
      if (o1.equals(o2))   return true;
     else   return false;
    }

    boolean method2(Object o1,Object o2){
      if (o1 == null)   return o2 == null;
     else   return o2 != null && o1.equals(o2);
    }
}
