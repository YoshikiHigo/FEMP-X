package all;

public class ClonePair12519 {

    double[][] method1(double[] v,int nrow,int ncol){
      double[][] m=new double[nrow][ncol];
      for (int i=0; i < ncol; i++) {
        for (int j=0; j < nrow; j++) {
          m[j][i]=v[j + i * nrow];
        }
      }
      return (m);
    }

    double[][] method2(double[] array,int dim1Size,int dim2Size){
      double[][] newArray=new double[dim1Size][dim2Size];
      int k=0;
      for (int i=0; i < newArray.length; i++) {
        for (int j=0; j < newArray[i].length; j++) {
          newArray[i][j]=array[k++];
        }
      }
      return newArray;
    }
}
