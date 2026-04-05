package unverified;

public class ClonePair8379 {

    int method1(String string,int p){
      while (p < string.length() && !Character.isWhitespace(string.charAt(p))) {
        p++;
      }
      return p;
    }

    int method2(String string,int pos){
      final int length=string.length();
      while ((pos < length) && !Character.isWhitespace(string.charAt(pos))) {
        pos++;
      }
      return pos;
    }
}
