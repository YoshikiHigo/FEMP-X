package all;

public class ClonePair8148 {

    boolean method1(int[] a,int N,int v){
      for (int i=0; i < N; i++) {
        if (a[i] == v) {
          return true;
        }
      }
      return false;
    }

    boolean method2(int[] okItem,int max,int value){
      for (int k=0; k < max; k++) {
        if (value == okItem[k]) {
          return true;
        }
      }
      return false;
    }
}
