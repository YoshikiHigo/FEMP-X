package all;

public class ClonePair13410 {

    boolean method1(byte primeiro[],byte segundo[]){
      if (primeiro.length != segundo.length)   return false;
     else   if (primeiro == segundo)   return true;
     else {
        boolean iguais=true;
        int i=0;
        for (i=0; i < primeiro.length && iguais; i++) {
          int j=0;
          for (j=0; j < segundo.length && primeiro[i] != segundo[j]; j++)       ;
          if (j >= segundo.length)       iguais=false;
        }
        return iguais;
      }
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
