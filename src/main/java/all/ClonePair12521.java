package all;

public class ClonePair12521 {

    double[][] method1(double[] v,int nrow,int ncol){
      double[][] m=new double[nrow][ncol];
      for (int i=0; i < ncol; i++) {
        for (int j=0; j < nrow; j++) {
          m[j][i]=v[j + i * nrow];
        }
      }
      return (m);
    }

    double[][] method2(double[] A,int w,int h){
      double[][] A2D=new double[w][h];
      for (int i=0; i < w; i++) {
        for (int j=0; j < h; j++) {
          A2D[i][j]=A[j * w + i];
        }
      }
      return A2D;
    }
}
