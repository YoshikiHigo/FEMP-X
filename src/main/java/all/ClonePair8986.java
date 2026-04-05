package all;

public class ClonePair8986 {

    int method1(String dnChain,int startIndex){
      while (startIndex < dnChain.length() && dnChain.charAt(startIndex) == ' ') {
        startIndex++;
      }
      return startIndex;
    }

    int method2(String s,int start){
      char c;
      int len=s.length();
      while (start < len && ((c=s.charAt(start)) == ' ' || c == '\n' || c == '\r' || c == '\t'))   start++;
      return start;
    }
}
