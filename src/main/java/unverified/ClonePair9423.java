package unverified;

public class ClonePair9423 {

    int method1(int[] values){
      int result=values[0];
      for (  int i : values)   if (i > result)   result=i;
      return result;
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
