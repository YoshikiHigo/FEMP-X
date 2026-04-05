package all;

public class ClonePair12676 {

    String method1(String str,char white){
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

    String method2(String s,char strip){
      final int sLen=s.length();
      int newStart=0, newEnd=sLen - 1;
      while (newStart < sLen && s.charAt(newStart) == strip) {
        newStart++;
      }
      while (newEnd >= 0 && s.charAt(newEnd) == strip) {
        newEnd--;
      }
      newEnd++;
      if (newStart >= sLen || newEnd < 0) {
        return "";
      }
      return s.substring(newStart,newEnd);
    }
}
