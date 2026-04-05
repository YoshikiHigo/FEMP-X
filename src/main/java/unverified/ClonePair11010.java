package unverified;

public class ClonePair11010 {

    int method1(CharSequence s1,CharSequence s2){
      int i=0;
      while (s1.length() > i && s2.length() > i && s1.charAt(i) == s2.charAt(i)) {
        i++;
      }
      return i;
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
