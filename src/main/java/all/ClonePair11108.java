package all;

public class ClonePair11108 {

    double[][] method1(double[][] M,int i1,int i2,int j1,int j2){
      double[][] array=new double[i2 - i1 + 1][j2 - j1 + 1];
      for (int i=0; i < i2 - i1 + 1; i++) {
        System.arraycopy(M[i + i1],j1,array[i],0,j2 - j1 + 1);
      }
      return array;
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
