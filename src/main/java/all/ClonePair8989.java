package all;

public class ClonePair8989 {

    int method1(String dnChain,int startIndex){
      while (startIndex < dnChain.length() && dnChain.charAt(startIndex) == ' ') {
        startIndex++;
      }
      return startIndex;
    }

    int method2(String dnChain,int startIndex){
      while (startIndex < dnChain.length() && dnChain.charAt(startIndex) == ' ')   startIndex++;
      return startIndex;
    }
}
