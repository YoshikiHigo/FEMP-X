package all;

public class ClonePair12530 {

    int method1(String c,char l,int p){
      for (int n=p; n < c.length(); n++) {
        if (c.charAt(n) == l)     return n;
      }
      return -1;
    }

    int method2(String string,char c,int start){
      int i=start;
      while (i < string.length()) {
        if (string.charAt(i) == c) {
          return i;
        }
     else {
          i++;
        }
      }
      return -1;
    }
}
