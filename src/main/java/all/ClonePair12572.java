package all;

public class ClonePair12572 {

    String method1(String quotedString,boolean quotesRequired){
      if (quotedString.length() > 0 && quotedString.charAt(0) != '"' && !quotesRequired) {
        return quotedString;
      }
     else   if (quotedString.length() > 2) {
        return quotedString.substring(1,quotedString.length() - 1);
      }
     else {
        return "";
      }
    }

    String method2(String quotedString,boolean quotesRequired){
      if (quotedString.length() > 0 && quotedString.charAt(0) != '"' && !quotesRequired) {
        return quotedString;
      }
     else   if (quotedString.length() > 2) {
        return quotedString.substring(1,quotedString.length() - 1);
      }
     else {
        return new String();
      }
    }
}
