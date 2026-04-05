package unverified;

public class ClonePair11106 {

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
