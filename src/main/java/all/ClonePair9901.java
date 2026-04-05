package all;

public class ClonePair9901 {

    int method1(int[] X){
      int max=Integer.MIN_VALUE;
      int m=X.length;
      if (m == 0) {
        return 0;
      }
      for (int i=0; i < m; i++) {
        if (X[i] > max) {
          max=X[i];
        }
      }
      return max;
    }

    int method2(int[] vec){
      if (vec.length != 0) {
        int max=vec[0];
        for (int i=0; i < vec.length; i++)     if (vec[i] > max)     max=vec[i];
        return max;
      }
      return 0;
    }
}
