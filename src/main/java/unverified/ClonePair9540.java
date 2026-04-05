package unverified;

public class ClonePair9540 {

    boolean method1(int[] features){
      for (int i=1; i < features.length; i++)   if (features[i - 1] >= features[i])   return false;
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
