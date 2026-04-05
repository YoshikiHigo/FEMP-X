package all;

public class ClonePair8987 {

    int method1(String dnChain,int startIndex){
      while (startIndex < dnChain.length() && dnChain.charAt(startIndex) == ' ') {
        startIndex++;
      }
      return startIndex;
    }

    int method2(String s,int start){
      while ((start < s.length()) && Character.isWhitespace(s.charAt(start)))   start++;
      return start;
    }
}
