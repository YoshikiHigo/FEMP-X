package all;

public class ClonePair9541 {

    boolean method1(int[] features){
      for (int i=1; i < features.length; i++)   if (features[i - 1] >= features[i])   return false;
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
