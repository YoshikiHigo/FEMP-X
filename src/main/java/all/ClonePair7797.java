package all;

public class ClonePair7797 {

    boolean method1(Object o1,Object o2){
      if (o1 == null)   return o2 == null;
     else   return o2 != null && o1.equals(o2);
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
