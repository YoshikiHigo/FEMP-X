package all;

public class ClonePair12677 {

    String method1(String source,char target){
      int i=source.length() - 1;
      while (i >= 0 && source.charAt(i) == target)   i--;
      return source.substring(0,i + 1);
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
