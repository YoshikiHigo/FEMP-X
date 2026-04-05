package all;

public class ClonePair10834 {

    int method1(String dnChain,int startIndex){
      while (startIndex < dnChain.length() && dnChain.charAt(startIndex) == ' ')   startIndex++;
      return startIndex;
    }

    int method2(String s,int pos){
      while (pos < s.length() && Character.isWhitespace(s.charAt(pos)))   pos++;
      return pos;
    }
}
