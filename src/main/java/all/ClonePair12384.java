package all;

public class ClonePair12384 {

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

    boolean method2(String _str){
      boolean result=true;
      _str=_str.trim();
      if (_str.equals("")) {
        result=false;
      }
     else {
        if (('a' <= _str.toLowerCase().charAt(0) && _str.toLowerCase().charAt(0) <= 'z') || (_str.toLowerCase().charAt(0) == '_')) {
          if (_str.length() > 1) {
            for (int i=0; i < _str.length(); i++) {
              if (!(('a' <= _str.toLowerCase().charAt(0) && _str.toLowerCase().charAt(0) <= 'z') || ('0' <= _str.charAt(0) && _str.charAt(0) <= '9') || (_str.toLowerCase().charAt(0) == '_'))) {
                result=false;
              }
            }
          }
        }
     else {
          result=false;
        }
      }
      return result;
    }
}
