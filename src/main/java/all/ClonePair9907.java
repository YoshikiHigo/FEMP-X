package all;

public class ClonePair9907 {

    int method1(int[] X){
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

    int method2(int[] list){
      int min=0;
      if (list.length > 0) {
        min=list[0];
        for (int i=0; i < list.length; i++) {
          if (min > list[i])       min=list[i];
        }
      }
      return min;
    }
}
