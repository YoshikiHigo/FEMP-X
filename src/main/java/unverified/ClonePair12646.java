package unverified;

public class ClonePair12646 {

    String method1(String str,char character){
      if (str == null || str.length() == 0) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str);
      while (buf.length() > 0 && buf.charAt(0) == character) {
        buf.deleteCharAt(0);
      }
      while (buf.length() > 0 && buf.charAt(buf.length() - 1) == character) {
        buf.deleteCharAt(buf.length() - 1);
      }
      return buf.toString();
    }

    String method2(String str,char c){
      if (str == null) {
        return null;
      }
      int len=str.length();
      int st=0;
      while ((st < len) && (str.charAt(st) == c)) {
        st++;
      }
      while ((len > st) && (str.charAt(len - 1) == c)) {
        len--;
      }
      return ((st > 0) || (len < str.length())) ? str.substring(st,len) : str;
    }
}
