package all;

public class ClonePair9546 {

    boolean method1(int[] features){
      for (int i=1; i < features.length; i++)   if (features[i - 1] >= features[i])   return false;
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
