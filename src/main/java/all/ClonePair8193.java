package all;

public class ClonePair8193 {

    int method1(String cond,int sidx,int len){
      while (sidx < len && cond.charAt(sidx) == ' ') {
        sidx++;
      }
      return sidx;
    }

    int method2(String ss,int i,int l){
      while (i < l) {
        if (!Character.isWhitespace(ss.charAt(i))) {
          break;
        }
        i++;
      }
      return i;
    }
}
