package all;

public class ClonePair12258 {

    String method1(String s,int n){
      StringBuffer b=new StringBuffer();
      boolean wrapPending=false;
      for (int i=0; i < s.length(); i++) {
        if (((i % n) == 0) && (i > 0)) {
          wrapPending=true;
        }
        char c=s.charAt(i);
        if (wrapPending && (c == ' ')) {
          b.append("\n");
          wrapPending=false;
        }
     else {
          b.append(c);
        }
      }
      return b.toString();
    }

    String method2(String s,int n){
      StringBuffer b=new StringBuffer();
      boolean wrapPending=false;
      for (int i=0; i < s.length(); i++) {
        if (i % n == 0 && i > 0) {
          wrapPending=true;
        }
        char c=s.charAt(i);
        if (wrapPending && c == ' ') {
          b.append("\n");
          wrapPending=false;
        }
     else {
          b.append(c);
        }
      }
      return b.toString();
    }
}
