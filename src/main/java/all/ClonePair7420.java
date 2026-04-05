package all;

public class ClonePair7420 {

    boolean method1(Object o1,Object o2){
      if (o1 == null) {
        return o2 == null;
      }
      if (o1 instanceof Integer && o2 instanceof Integer)   return ((Integer)o1).equals((Integer)o2);
     else   return o1.equals(o2);
    }

    boolean method2(Object actExc,Object expExc){
      if (expExc == null) {
        return actExc == null;
      }
     else {
        return actExc != null && expExc.getClass() == actExc.getClass();
      }
    }
}
