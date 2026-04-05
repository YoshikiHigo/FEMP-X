package all;

public class ClonePair4603 {

    double method1(float[][] m){
      double aggr=0;
      for (int j=0; j < m.length; j++)   for (int i=0; i < m[0].length; i++)   aggr+=m[j][i];
      return aggr;
    }

    double method2(float[][] array){
      float total=0;
      for (int i=0; i < array.length; i++) {
        for (int j=0; j < array[0].length; j++) {
          total=total + array[i][j];
        }
      }
      return total;
    }
}
