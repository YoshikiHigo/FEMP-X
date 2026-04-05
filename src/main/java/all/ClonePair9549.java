package all;

public class ClonePair9549 {

    boolean method1(int[] positions){
      for (int i=0; i < positions.length; i++) {
        for (int j=i + 1; j < positions.length; j++) {
          if (positions[i] == positions[j] || positions[i] - i == positions[j] - j || positions[i] + i == positions[j] + j)       return false;
        }
      }
      return true;
    }

    boolean method2(int[] array){
      boolean sorted=true;
      for (int i=0; i < array.length - 1 && sorted; ++i) {
        sorted=array[i] < array[i + 1];
      }
      return sorted;
    }
}
