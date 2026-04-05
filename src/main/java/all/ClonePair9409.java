package all;

public class ClonePair9409 {

    int method1(int[] t){
      int m=t[0];
      for (int i=1; i < t.length; i++)   if (t[i] < m)   m=t[i];
      return m;
    }

    int method2(int[] polje){
      int min=polje[0];
      for (int i=1; i < polje.length; i++) {
        if (polje[i] < min)     min=polje[i];
      }
      return min;
    }
}
