package all;

public class ClonePair9543 {

    boolean method1(int[] features){
      for (int i=1; i < features.length; i++)   if (features[i - 1] >= features[i])   return false;
      return true;
    }

    boolean method2(int[] values){
      for (int i=1; i < values.length; i++) {
        if (values[i - 1] >= values[i])     return false;
      }
      return true;
    }
}
