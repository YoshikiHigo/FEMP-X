package unverified;

public class ClonePair9158 {

    boolean method1(String val,String end){
      int i=val.length() - 1;
      for (int iEnd=end.length() - 1; iEnd >= 0; i--, iEnd--) {
        if (val.charAt(i) != end.charAt(iEnd))     return false;
      }
      return true;
    }

    boolean method2(String source,String begin){
      for (int i=0; i < begin.length(); i++) {
        char c1=source.charAt(i);
        char c2=begin.charAt(i);
        if (c1 != c2) {
          return false;
        }
      }
      return true;
    }
}
