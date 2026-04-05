package unverified;

public class ClonePair9333 {

    int method1(int[] values){
      int largestvalue=values[0];
      for (int i=1; i < values.length; i++)   if (values[i] > largestvalue)   largestvalue=values[i];
      return largestvalue;
    }

    int method2(int[] s){
      int mx=s[0];
      for (int k=1; k < s.length; ++k) {
        if (mx < s[k]) {
          mx=s[k];
        }
      }
      return mx;
    }
}
