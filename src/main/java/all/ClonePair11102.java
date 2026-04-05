package all;

public class ClonePair11102 {

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

    double[][] method2(double[][] mat,int firstr,int lastr,int firstc,int lastc){
      int icnt=0, jcnt=0;
      final double[][] res=new double[(lastr - firstr + 1)][(lastc - firstc + 1)];
      for (int i=firstr; i <= lastr; i++) {
        for (int j=firstc; j <= lastc; j++) {
          res[icnt][jcnt++]=mat[i][j];
        }
        ++icnt;
        jcnt=0;
      }
      return res;
    }
}
