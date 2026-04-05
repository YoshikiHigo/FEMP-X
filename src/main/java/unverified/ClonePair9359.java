package unverified;

public class ClonePair9359 {

    int method1(int[] sn){
      int result=sn[0];
      for (int i=0; i < sn.length; i++) {
        if (result < sn[i])     result=sn[i];
      }
      return result;
    }

    int method2(int[] vet){
      int max=vet[0];
      for (int i=1; i < vet.length; i++) {
        if (vet[i] > max) {
          max=vet[i];
        }
      }
      return (max);
    }
}
