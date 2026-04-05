package unverified;

public class ClonePair7537 {

    boolean method1(Object a,Object b){
      if (a == b)   return true;
     else   if ((a == null) || (b == null))   return false;
     else   return a.getClass() == b.getClass();
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
