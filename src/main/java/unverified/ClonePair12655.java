package unverified;

public class ClonePair12655 {

    String method1(String str,char cc){
      int i=0, j=str.length();
      while ((i < j) && str.charAt(i) == cc) {
        i++;
      }
      while ((i < j) && str.charAt(j - 1) == cc) {
        j--;
      }
      return str.substring(i,j);
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
