package all;

import java.util.Arrays;

public class ClonePair3555 {

    boolean method1(double[][] a,double[][] b){
      int rowsA=a.length;
      int rowsB=b.length;
      if (rowsA != rowsB) {
        return false;
      }
     else {
        for (int i=0; i < rowsA; i++) {
          if (!Arrays.equals(a[i],b[i])) {
            return false;
          }
        }
      }
      return true;
    }

    boolean method2(double[][] X,double[][] Y){
      if (X.length != Y.length) {
        return false;
      }
      for (int i=0; i < X.length; i++) {
        if (X[i].length != Y[i].length) {
          return false;
        }
        for (int j=0; j < X[i].length; j++) {
          if (X[i][j] != Y[i][j]) {
            return false;
          }
        }
      }
      return true;
    }
}
