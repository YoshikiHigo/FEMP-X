package all;

public class ClonePair8119 {

    boolean method1(int[][] matrizA,int[][] matrizB){
      for (int i=0; i < matrizA.length; i++) {
        for (int j=0; j < matrizA[i].length; j++) {
          if (matrizA[i][j] != matrizB[i][j])       return false;
        }
      }
      return true;
    }

    boolean method2(int[][] one,int[][] two){
      for (int i=0; i < one.length; i++) {
        for (int j=0; j < one[i].length; j++) {
          if (!(one[i][j] == two[i][j])) {
            return false;
          }
        }
      }
      return true;
    }
}
