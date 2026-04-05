package all;

public class ClonePair11008 {

    int method1(CharSequence text1,CharSequence text2){
      int n=Math.min(text1.length(),text2.length());
      for (int i=0; i < n; i++) {
        if (text1.charAt(i) != text2.charAt(i)) {
          return i;
        }
      }
      return n;
    }

    int method2(CharSequence s1,CharSequence s2){
      int i=0;
      while (s1.length() > i && s2.length() > i && s1.charAt(i) == s2.charAt(i)) {
        i++;
      }
      return i;
    }
}
