package unverified;

public class ClonePair9840 {

    int method1(String line,int len){
      int cntr;
      for (cntr=len - 1; cntr >= 0; cntr--) {
        if (!Character.isLetterOrDigit(line.charAt(cntr))) {
          cntr++;
          break;
        }
      }
      if (cntr <= 0)   cntr=len;
      return cntr;
    }

    int method2(String s,int len){
      int plus=0;
      for (int i=0; i < len; i++) {
        char c=s.charAt(i);
        if (c >= 0x800) {
          plus+=2;
        }
     else     if (c >= 0x80) {
          plus++;
        }
      }
      return len + plus;
    }
}
