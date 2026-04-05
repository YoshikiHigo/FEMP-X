package unverified;

public class ClonePair8576 {

    int method1(String s,int start){
      int limit=s.length();
      int i=start;
      for (; i < limit; i++) {
        if (s.charAt(i) != ' ') {
          break;
        }
      }
      return i;
    }

    int method2(String dnChain,int startIndex){
      while (startIndex < dnChain.length() && dnChain.charAt(startIndex) == ' ') {
        startIndex++;
      }
      return startIndex;
    }
}
