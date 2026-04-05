package unverified;

public class ClonePair8949 {

    int[][] method1(int[][] A,int[][] B){
      int[][] result=new int[A.length][A.length];
      for (int i=0; i < A.length; i++) {
        for (int j=0; j < A.length; j++) {
          if (B[i][j] >= 0) {
            result[i][j]=A[i][j];
          }
     else {
            result[i][j]=Integer.MAX_VALUE;
          }
        }
      }
      return result;
    }

    int[][] method2(int[][] A,int[][] B){
      int[][] result=new int[A.length][A.length];
      for (int i=0; i < A.length; i++) {
        for (int j=0; j < A.length; j++) {
          if (B[i][j] < 0) {
            result[i][j]=A[i][j];
          }
     else {
            result[i][j]=Integer.MAX_VALUE;
          }
        }
      }
      return result;
    }
}
