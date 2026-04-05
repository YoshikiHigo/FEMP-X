package all;

public class ClonePair9411 {

    int method1(int[] t){
      int m=t[0];
      for (int i=1; i < t.length; i++)   if (t[i] < m)   m=t[i];
      return m;
    }

    int method2(int[] a){
      int min=a[0];
      for (int i=0; i < a.length; i++) {
        if (min > a[i]) {
          min=a[i];
        }
      }
      return min;
    }
}
