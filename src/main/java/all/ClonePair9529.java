package all;

public class ClonePair9529 {

    boolean method1(int[] a){
      for (int i=1; i < a.length; i++) {
        if (a[i] <= a[i - 1]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] positions){
      for (int i=0; i < positions.length; i++) {
        for (int j=i + 1; j < positions.length; j++) {
          if (positions[i] == positions[j] || positions[i] - i == positions[j] - j || positions[i] + i == positions[j] + j)       return false;
        }
      }
      return true;
    }
}
