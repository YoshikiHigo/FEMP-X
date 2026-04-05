package all;

public class ClonePair7418 {

    boolean method1(Object o1,Object o2){
      if (o1 == null) {
        return o2 == null;
      }
      if (o1 instanceof Integer && o2 instanceof Integer)   return ((Integer)o1).equals((Integer)o2);
     else   return o1.equals(o2);
    }

    boolean method2(Object obj1,Object obj2){
      if (obj1 == null)   return (obj2 == null);
      return ((obj2 != null) && obj1.equals(obj2));
    }
}
