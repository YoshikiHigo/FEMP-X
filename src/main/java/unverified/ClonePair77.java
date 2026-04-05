package unverified;

public class ClonePair77 {

    int method1(char[] ary,char ch,int start){
      for (int i=start; i < ary.length; i++) {
        if (ch == ary[i]) {
          return i;
        }
      }
      return -1;
    }

    int method2(char[] src,char des,int start){
      for (int i=start; i < src.length; i++) {
        if (src[i] == des)     return i;
      }
      return -1;
    }
}
