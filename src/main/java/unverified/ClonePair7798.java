package unverified;

public class ClonePair7798 {

    boolean method1(Object o1,Object o2){
      if (o1 == null)   return o2 == null;
     else   return o2 != null && o1.equals(o2);
    }

    boolean method2(Object obj1,Object obj2){
      if (obj1 == null)   return (obj2 == null);
      return ((obj2 != null) && obj1.equals(obj2));
    }
}
