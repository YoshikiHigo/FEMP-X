package all;

public class ClonePair12653 {

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
