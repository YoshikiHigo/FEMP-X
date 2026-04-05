package all;

public class ClonePair9553 {

    boolean method1(int[] positions){
      for (int i=0; i < positions.length; i++) {
        for (int j=i + 1; j < positions.length; j++) {
          if (positions[i] == positions[j] || positions[i] - i == positions[j] - j || positions[i] + i == positions[j] + j)       return false;
        }
      }
      return true;
    }

    boolean method2(int[] rest){
      for (int i=1; i < rest.length; i++) {
        if (rest[i - 1] + 1 != rest[i]) {
          return false;
        }
      }
      return true;
    }
}
