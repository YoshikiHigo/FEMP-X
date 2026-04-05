package all;

public class ClonePair6230 {

    boolean method1(boolean[] ba,boolean[] ba2){
      if (ba.length == 0 && ba2.length == 0)   return true;
      if (ba.length != ba2.length)   return false;
      int c=ba.length;
      for (int i=0; i < c; i++)   if (!(ba[i] == ba2[i]))   return false;
      return true;
    }

    boolean method2(boolean[] a,boolean[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
