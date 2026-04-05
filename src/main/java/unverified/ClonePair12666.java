package unverified;

public class ClonePair12666 {

    String method1(String in,char delim){
      char[] chars=in.toCharArray();
      int c=chars.length - 1;
      boolean found=false;
      while (c >= 0 && !found) {
        if (chars[c--] != delim)     found=true;
      }
      String ret="";
      if (found)   ret=String.valueOf(chars,0,c + 2);
      return ret;
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
