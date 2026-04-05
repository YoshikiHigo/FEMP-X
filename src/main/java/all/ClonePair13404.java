package all;

public class ClonePair13404 {

    boolean method1(byte digesta[],byte digestb[]){
      if (digesta.length != digestb.length)   return false;
      for (int i=0; i < digesta.length; i++) {
        if (digesta[i] != digestb[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte digest1[],byte digest2[]){
      if (digest1.length != digest2.length)   return false;
      for (int i=0; i < digest1.length; i++)   if (digest1[i] != digest2[i])   return false;
      return true;
    }
}
