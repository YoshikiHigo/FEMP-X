package all;

public class ClonePair12543 {

    int method1(String text){
      if (text.length() == 0) {
        return -1;
      }
      for (int i=0; i < text.length(); i++) {
        if (Character.isWhitespace(text.charAt(i))) {
          return i;
        }
      }
      return -1;
    }

    int method2(String s){
      int i=s.length();
      int n=s.indexOf("\n");
      int t=s.indexOf("\t");
      int sp=s.indexOf(" ");
      int r=s.indexOf("\r");
      if (n == -1 && t == -1 && sp == -1 && r == -1)   return -1;
      if (n != -1)   i=n;
      if (t != -1 && t < i)   i=t;
      if (sp != -1 && sp < i)   i=sp;
      if (r != -1 && r < i)   i=r;
      return i;
    }
}
