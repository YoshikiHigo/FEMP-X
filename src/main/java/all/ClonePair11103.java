package all;

public class ClonePair11103 {

    double[][] method1(double[][] A,int i0,int i1,int j0,int j1){
      int m=i1 - i0 + 1;
      int n=j1 - j0 + 1;
      double[][] part=new double[m][n];
      for (int i=0; i < m; i++) {
        for (int j=0; j < n; j++) {
          part[i][j]=A[i + i0][j + j0];
        }
      }
      return part;
    }

    double[][] method2(double[][] in,int lb1,int ub1,int lb2,int ub2){
      double out[][]=new double[ub1 - lb1 + 1][ub2 - lb2 + 1];
      for (int i=0; i < out.length; i++) {
        for (int j=0; j < out[i].length; j++) {
          out[i][j]=in[lb1 + i][lb2 + j];
        }
      }
      return out;
    }
}
