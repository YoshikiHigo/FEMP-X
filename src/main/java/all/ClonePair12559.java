package all;

public class ClonePair12559 {

    String method1(String value,boolean isAttr){
      if (value == null)   return "";
      char[] data=value.toCharArray();
      StringBuilder out=new StringBuilder(data.length + 16);
      for (  char c : data) {
    switch (c) {
    case '<':      out.append("&lt;");
        break;
    case '>':  out.append("&gt;");
    break;
    case '&':out.append("&amp;");
    break;
    case ' ':out.append("&nbsp;");
    break;
    case '"':if (isAttr) {
    out.append("&quot;");
    break;
    }
    default:out.append(c);
    break;
    }
    }
    return out.toString();
    }

    String method2(String in,boolean attr){
      if (in == null || in.trim().length() == 0) {
        return "";
      }
      if (attr) {
        if (in.indexOf('&') == -1 && in.indexOf('\"') == -1 && in.indexOf('<') == -1 && in.indexOf('>') == -1) {
          return in;
        }
      }
     else   if (in.indexOf('&') == -1 && in.indexOf('<') == -1 && in.indexOf('>') == -1) {
        return in;
      }
      final StringBuilder result=new StringBuilder(in.length());
      final char chars[]=in.toCharArray();
      for (int i=0; i < chars.length; i++) {
        if (chars[i] == '&') {
          result.append("&amp;");
        }
     else     if (chars[i] == '<') {
          result.append("&lt;");
        }
     else     if (chars[i] == '>') {
          result.append("&gt;");
        }
     else     if (attr && chars[i] == '\"') {
          result.append("&quot;");
        }
     else {
          result.append(chars[i]);
        }
      }
      return result.toString();
    }
}
