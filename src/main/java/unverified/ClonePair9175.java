package unverified;

public class ClonePair9175 {

    boolean method1(String str,String subStr){
      for (int i=0; i < subStr.length(); i++) {
        if (subStr.charAt(i) != str.charAt(i)) {
          return false;
        }
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
