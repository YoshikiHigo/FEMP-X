package unverified;

public class ClonePair9376 {

    int method1(int[] array){
      int max=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] > max) {
          max=array[i];
        }
      }
      return max;
    }

    int method2(int[] s){
      int mx=s[0];
      for (int k=1; k < s.length; ++k) {
        if (mx < s[k]) {
          mx=s[k];
        }
      }
      return mx;
    }
}
