package unverified;

public class ClonePair12412 {

    boolean method1(String toke){
      if (toke.length() == 0) {
        return false;
      }
      if (false == Character.isLetter(toke.charAt(0)) && toke.charAt(0) != '_') {
        return false;
      }
      for (int i=1; i < toke.length(); i++) {
        char ch=toke.charAt(i);
        if (Character.isLetterOrDigit(ch) == false && ch != '.' && ch != '-' && ch != '_' && (ch == '\\' && i == toke.length() - 1)) {
          return false;
        }
        if (ch == '\\') {
          i++;
        }
      }
      return true;
    }

    boolean method2(String defAttr){
      if (defAttr.length() == 0)   return false;
      final char first=defAttr.charAt(0);
      return first >= 'A' && first <= 'z';
    }
}
