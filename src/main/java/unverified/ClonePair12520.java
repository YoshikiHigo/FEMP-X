package unverified;

public class ClonePair12520 {

    double[][] method1(double[] A,int w,int h){
      double[][] A2D=new double[w][h];
      for (int i=0; i < w; i++) {
        for (int j=0; j < h; j++) {
          A2D[i][j]=A[j * w + i];
        }
      }
      return A2D;
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
