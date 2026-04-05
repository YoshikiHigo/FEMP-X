package all;

public class ClonePair11112 {

    double[][] method1(double[][] in,int lb1,int ub1,int lb2,int ub2){
      double out[][]=new double[ub1 - lb1 + 1][ub2 - lb2 + 1];
      for (int i=0; i < out.length; i++) {
        for (int j=0; j < out[i].length; j++) {
          out[i][j]=in[lb1 + i][lb2 + j];
        }
      }
      return out;
    }

    double[][] method2(double[][] M,int i1,int i2,int j1,int j2){
      double[][] array=new double[i2 - i1 + 1][j2 - j1 + 1];
      for (int i=0; i < i2 - i1 + 1; i++) {
        System.arraycopy(M[i + i1],j1,array[i],0,j2 - j1 + 1);
      }
      ;
      return array;
    }
}
