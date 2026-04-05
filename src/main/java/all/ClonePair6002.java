package all;

public class ClonePair6002 {

    int[][] method1(int[][] A,int a,int b){
      int[][] result=new int[A.length][A.length];
      for (int i=0; i < A.length; i++) {
        for (int j=0; j < A.length; j++) {
          if (A[i][j] >= a && A[i][j] <= b) {
            result[i][j]=A[i][j];
          }
     else {
            result[i][j]=Integer.MAX_VALUE;
          }
        }
      }
      return result;
    }

    int[][] method2(int[][] A,int a,int b){
      int[][] result=new int[A.length][A.length];
      for (int i=0; i < A.length; i++) {
        for (int j=0; j < A.length; j++) {
          if (A[i][j] < a) {
            result[i][j]=a;
          }
     else       if (A[i][j] > b) {
            result[i][j]=Integer.MAX_VALUE;
          }
     else {
            result[i][j]=A[i][j];
          }
        }
      }
      return result;
    }
}
