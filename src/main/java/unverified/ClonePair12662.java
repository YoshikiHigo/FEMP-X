package unverified;

public class ClonePair12662 {

    String method1(String src,char d){
      int st=0;
      int len=src.length() - 1;
      while (st < len && src.charAt(st) == d) {
        st++;
      }
      while (len > st && src.charAt(len) == d) {
        len--;
      }
      return src.substring(st,len + 1);
    }

    String method2(String str,char white){
      int len=str.length();
      int count=len;
      int start=0;
      int off=0;
      while ((start < len) && (str.charAt(off + start) == white)) {
        start++;
      }
      while ((start < len) && (str.charAt(off + len - 1) == white)) {
        len--;
      }
      String retval=((start > 0) || (len < count)) ? str.substring(start,len) : str;
      return retval;
    }
}
