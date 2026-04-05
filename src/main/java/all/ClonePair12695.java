package all;

public class ClonePair12695 {

    String method1(String fin,boolean attr){
      String in=fin != null ? fin.trim() : null;
      if (in == null || in.length() == 0) {
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
      in=result.toString();
      return in;
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
