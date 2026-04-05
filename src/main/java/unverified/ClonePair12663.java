package unverified;

public class ClonePair12663 {

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
