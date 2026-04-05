package all;

public class ClonePair9317 {

    int method1(int[] vec){
      if (vec.length != 0) {
        int min=vec[0];
        for (int i=0; i < vec.length; i++)     if (vec[i] < min)     min=vec[i];
        return min;
      }
      return 0;
    }

    int method2(int[] X){
      int min=Integer.MAX_VALUE;
      int m=X.length;
      if (m == 0) {
        return 0;
      }
      for (int i=0; i < m; i++) {
        if (X[i] < min) {
          min=X[i];
        }
      }
      return min;
    }
}
