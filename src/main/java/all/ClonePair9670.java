package all;

public class ClonePair9670 {

    int method1(int[] list){
      int max=0;
      if (list.length > 0) {
        max=list[0];
        for (int i=0; i < list.length; i++) {
          if (max < list[i])       max=list[i];
        }
      }
      return max;
    }

    int method2(int[] X){
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
}
