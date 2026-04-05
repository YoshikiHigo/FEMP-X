package all;

public class ClonePair13403 {

    boolean method1(byte digesta[],byte digestb[]){
      if (digesta.length != digestb.length)   return false;
      for (int i=0; i < digesta.length; i++) {
        if (digesta[i] != digestb[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte a1[],byte a2[]){
      if (a1.length != a2.length) {
        return (false);
      }
     else {
        boolean result=true;
        for (int ii=0; ii < a1.length; ii++) {
          if (a1[ii] != a2[ii])       result=false;
        }
        return (result);
      }
    }
}
