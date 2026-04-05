package all;

public class ClonePair13402 {

    boolean method1(byte digesta[],byte digestb[]){
      if (digesta.length != digestb.length)   return false;
      for (int i=0; i < digesta.length; i++) {
        if (digesta[i] != digestb[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte primeiro[],byte segundo[]){
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
}
