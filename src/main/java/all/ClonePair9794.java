package all;

public class ClonePair9794 {

    int method1(String s,int i){
      int j=i;
      while (j < s.length() && Character.isWhitespace(s.charAt(j))) {
        ++j;
      }
      return j;
    }

    int method2(String s,int pos){
      while (pos < s.length() && Character.isWhitespace(s.charAt(pos)))   pos++;
      return pos;
    }
}
