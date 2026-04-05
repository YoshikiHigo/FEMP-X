package all;

public class ClonePair10346 {

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

    boolean method2(CharSequence s,CharSequence t){
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
}
