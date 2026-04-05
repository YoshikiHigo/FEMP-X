package all;

public class ClonePair12816 {

    String method1(String s,boolean noBreakSpaces){
      StringBuffer buf=null;
      int ix=0;
      for (int i=0, n=s.length(); i < n; i++) {
        String replacement=null;
    switch (s.charAt(i)) {
    case '"':      replacement="&quot;";
        break;
    case '<':  replacement="&lt;";
    break;
    case '>':replacement="&gt;";
    break;
    case '&':replacement="&amp;";
    break;
    case ' ':if (noBreakSpaces) {
    replacement="&nbsp;";
    }
    break;
    }
    if (replacement != null) {
    if (buf == null) {
    buf=new StringBuffer();
    }
    buf.append(s.substring(ix,i));
    buf.append(replacement);
    ix=i + 1;
    }
    }
    if (buf != null) {
    buf.append(s.substring(ix));
    return buf.toString();
    }
     else {
    return s;
    }
    }

    String method2(String checkString,boolean nonbreak){
      String result=new String();
      for (int pos=0; pos < checkString.length(); pos++) {
        char symbol=checkString.charAt(pos);
        if (symbol == ' ' && nonbreak) {
          result+="&nbsp;";
        }
     else     if (symbol == '<') {
          result+="&lt;";
        }
     else     if (symbol == '>') {
          result+="&gt;";
        }
     else     if (symbol == '&') {
          result+="&amp;";
        }
     else     if (symbol == '"') {
          result+="&quot;";
        }
     else {
          result+=symbol;
        }
      }
      return result;
    }
}
