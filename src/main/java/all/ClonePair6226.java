package all;

public class ClonePair6226 {

    boolean method1(boolean[] a,boolean[] b){
      if (a.length != b.length) {
        return false;
      }
      boolean res=true;
      for (int i=0; i < a.length; i++) {
        res&=a[i] == b[i];
      }
      return res;
    }

    boolean method2(boolean[] ba,boolean[] ba2){
      if (ba.length == 0 && ba2.length == 0)   return true;
      if (ba.length != ba2.length)   return false;
      int c=ba.length;
      for (int i=0; i < c; i++)   if (!(ba[i] == ba2[i]))   return false;
      return true;
    }
}
