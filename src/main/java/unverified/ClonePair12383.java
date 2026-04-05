package unverified;

public class ClonePair12383 {

    String method1(String value,boolean encodeSpaces){
      StringBuffer sb=new StringBuffer();
      int len=value.length();
      for (int i=0; i < len; i++) {
        char c=value.charAt(i);
        if (encodeSpaces && Character.isWhitespace(c))     sb.append("&nbsp;");
     else     if (c == '&')     sb.append("&amp;");
     else     if (c == '<')     sb.append("&lt;");
     else     if (c == '>')     sb.append("&gt;");
     else     if (c == '"')     sb.append("&quot;");
     else     sb.append(c);
      }
      return sb.toString();
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
