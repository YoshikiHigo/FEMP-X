package all;

public class ClonePair11009 {

    int method1(CharSequence text1,CharSequence text2){
      int n=Math.min(text1.length(),text2.length());
      for (int i=0; i < n; i++) {
        if (text1.charAt(i) != text2.charAt(i)) {
          return i;
        }
      }
      return n;
    }

    int method2(CharSequence a,CharSequence b){
      int result=0;
      int minLength=Math.min(a.length(),b.length());
      while (result < minLength && a.charAt(result) == b.charAt(result)) {
        result++;
      }
      return result;
    }
}
