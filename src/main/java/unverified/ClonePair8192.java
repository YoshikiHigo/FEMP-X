package unverified;

public class ClonePair8192 {

    int method1(String cond,int sidx,int len){
      while (sidx < len && cond.charAt(sidx) == ' ') {
        sidx++;
      }
      return sidx;
    }

    int method2(String text,int start,int len){
      while (start < len && text.charAt(start) <= 32) {
        start++;
      }
      return start;
    }
}
