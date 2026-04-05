package unverified;

public class ClonePair3183 {

    double[][] method1(double[][] X){
      double[][] Y=new double[X.length][X.length];
      for (int i=0; i < Y.length; i++) {
        for (int j=0; j < Y[0].length; j++) {
          double sum=0;
          for (int k=0; k < X[i].length; k++) {
            sum=sum + (X[i][k] * X[j][k]);
          }
          Y[i][j]=sum / (X[i].length - 1);
        }
      }
      return Y;
    }

    double[][] method2(double[][] bipartite_matrix){
      double[][] matrix=new double[bipartite_matrix.length][bipartite_matrix.length];
      for (int i=0; i < bipartite_matrix.length; i++) {
        for (int j=0; j < bipartite_matrix.length; j++) {
          if (i != j) {
            double[] values1=bipartite_matrix[i];
            double[] values2=bipartite_matrix[j];
            double sum=0.0;
            for (int z=0; z < values1.length; z++) {
              double val1=values1[z];
              double val2=values2[z];
              sum+=Math.sqrt(Math.pow((val1 - val2),2));
            }
            int elem=values1.length;
            matrix[i][j]=(double)sum / elem;
          }
        }
      }
      return matrix;
    }
}
