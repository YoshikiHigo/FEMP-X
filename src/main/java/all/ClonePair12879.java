package all;

public class ClonePair12879 {

    String method1(String _text,int maxLineLength){
      StringBuffer broken=new StringBuffer(_text.length() + 10);
      boolean needBreak=false;
      for (int i=0; i < _text.length(); i++) {
        if (i > 0 && i % maxLineLength == 0)     needBreak=true;
        final char c=_text.charAt(i);
        if (needBreak && Character.isWhitespace(c)) {
          System.out.println("Breaking: " + broken.toString());
          needBreak=false;
          broken.append('\n');
        }
     else {
          broken.append(c);
        }
      }
      System.out.println("Broken! " + broken.toString());
      return broken.toString();
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
