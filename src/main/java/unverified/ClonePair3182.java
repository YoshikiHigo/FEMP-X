package unverified;

public class ClonePair3182 {

    double[][] method1(double[][] bipartite_matrix){
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
              if (val1 == 1 && val2 == 1)           sum++;
            }
            int elem=values1.length;
            matrix[i][j]=sum;
          }
        }
      }
      return matrix;
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
