package all;

public class ClonePair8377 {

    int method1(String string,int p){
      while (p < string.length() && !Character.isWhitespace(string.charAt(p))) {
        p++;
      }
      return p;
    }

    int method2(String s,int pos){
      while (pos < s.length() && !Character.isWhitespace(s.charAt(pos)))   pos++;
      return pos;
    }
}
