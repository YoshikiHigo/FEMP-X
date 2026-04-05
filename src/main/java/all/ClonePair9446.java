package all;

public class ClonePair9446 {

    int method1(int[] vet){
      int max=vet[0];
      for (int i=1; i < vet.length; i++) {
        if (vet[i] > max) {
          max=vet[i];
        }
      }
      return (max);
    }

    int method2(int[] a){
      int res=a[0];
      int buff;
      for (int i=1; i < a.length; i++) {
        buff=a[i];
        if (buff > res) {
          res=buff;
        }
      }
      return res;
    }
}
