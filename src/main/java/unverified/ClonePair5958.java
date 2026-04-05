package unverified;

public class ClonePair5958 {

    boolean method1(String i1,String i2){
      if (i1.length() != 0 && !i1.equals("none") && !i1.equals(i2))   return false;
      return true;
    }

    boolean method2(String current,String active){
      int v1=0, v2=0;
      boolean bool=false;
      if (active == null) {
        active="";
      }
      try {
        v1=Integer.parseInt(current);
        v2=Integer.parseInt(active);
        bool=(v1 == v2) ? true : false;
      }
     catch (  NumberFormatException ex) {
        bool=(current.trim().equals(active.trim())) ? true : false;
      }
      return bool;
    }
}
