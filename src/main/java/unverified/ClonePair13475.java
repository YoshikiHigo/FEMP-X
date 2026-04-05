package unverified;

public class ClonePair13475 {

    String method1(String s,String what,String onWhat){
      if (s == null) {
        return null;
      }
      String res;
      int i;
      i=s.lastIndexOf(what);
      if (i < 0) {
        return s;
      }
      res=s.substring(0,i) + onWhat + s.substring(i + what.length());
      return res;
    }

    String method2(String str,String from,String to){
      if (str == null || str.length() == 0) {
        return str;
      }
     else   if (str.length() == 1 && str.equals(from)) {
        return to;
      }
     else   if (str.length() == 1 && !str.equals(from)) {
        return str;
      }
      int j=-1;
      while ((j=str.indexOf(from)) >= 0) {
        str=str.substring(0,j) + (char)5 + str.substring(j + from.length());
      }
      int i=-1;
      while ((i=str.indexOf((char)5)) >= 0) {
        str=str.substring(0,i) + to + str.substring(i + 1);
      }
      return str;
    }
}
