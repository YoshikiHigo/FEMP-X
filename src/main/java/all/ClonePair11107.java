package all;

public class ClonePair11107 {

    double[][] method1(double[][] mat,int firstr,int lastr,int firstc,int lastc){
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

    double[][] method2(double[][] M,int i1,int i2,int j1,int j2){
      double[][] array=new double[i2 - i1 + 1][j2 - j1 + 1];
      for (int i=0; i < i2 - i1 + 1; i++) {
        System.arraycopy(M[i + i1],j1,array[i],0,j2 - j1 + 1);
      }
      return array;
    }
}
