package all;

public class ClonePair9380 {

    int method1(int[] array){
      int min=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] < min) {
          min=array[i];
        }
      }
      return min;
    }

    int method2(int[] t){
      int m=t[0];
      for (int i=1; i < t.length; i++)   if (t[i] < m)   m=t[i];
      return m;
    }
}
