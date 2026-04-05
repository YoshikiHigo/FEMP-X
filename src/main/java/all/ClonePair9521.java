package all;

public class ClonePair9521 {

    int method1(int[] v){
      int min=v[0];
      for (int i=1; i < v.length; i++) {
        if (min > v[i]) {
          min=v[i];
        }
      }
      return (min);
    }

    int method2(int[] polje){
      int min=polje[0];
      for (int i=1; i < polje.length; i++) {
        if (polje[i] < min)     min=polje[i];
      }
      return min;
    }
}
