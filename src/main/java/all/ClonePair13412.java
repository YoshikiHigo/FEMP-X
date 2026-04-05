package all;

public class ClonePair13412 {

    boolean method1(byte a1[],byte a2[]){
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

    boolean method2(byte digest1[],byte digest2[]){
      if (digest1.length != digest2.length)   return false;
      for (int i=0; i < digest1.length; i++)   if (digest1[i] != digest2[i])   return false;
      return true;
    }
}
