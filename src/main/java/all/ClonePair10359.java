package all;

public class ClonePair10359 {

    boolean method1(CharSequence s,CharSequence t){
      if (s.length() < t.length()) {
        return false;
      }
      for (int i=0; i < t.length(); i++) {
        char slc=Character.toLowerCase(s.charAt(i));
        char tlc=Character.toLowerCase(t.charAt(i));
        if (slc != tlc) {
          return false;
        }
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
