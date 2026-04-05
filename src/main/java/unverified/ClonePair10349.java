package unverified;

public class ClonePair10349 {

    boolean method1(CharSequence text,CharSequence prefix){
      int p_length=prefix.length();
      if (p_length > text.length()) {
        return false;
      }
      for (int x=0; x < p_length; x++) {
        if (text.charAt(x) != prefix.charAt(x))     return false;
      }
      return true;
    }

    boolean method2(CharSequence sequence,CharSequence subsequence){
      if (sequence.length() < subsequence.length()) {
        return false;
      }
      for (int i=0; i < subsequence.length(); i++) {
        if (sequence.charAt(i) != subsequence.charAt(i)) {
          return false;
        }
      }
      return true;
    }
}
