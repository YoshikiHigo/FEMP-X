package all;

public class ClonePair5712 {

    boolean method1(String string,boolean sign){
      for (int i=0; i < string.length(); i++) {
        char c=string.charAt(i);
        if (sign && i == 0) {
          if (c == '+' || c == '-')       continue;
        }
        if (!Character.isDigit(c))     return false;
      }
      return true;
    }

    boolean method2(String _sheetName,boolean _canBeWaitSpace){
      for (int i=0; i < _sheetName.length(); i++) {
        char ch=_sheetName.charAt(i);
        if (!(Character.isLetterOrDigit(ch) || (ch == '_') || _canBeWaitSpace && (ch == ' '))) {
          return false;
        }
      }
      return true;
    }
}
