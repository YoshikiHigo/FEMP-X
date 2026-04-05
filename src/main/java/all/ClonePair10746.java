package all;

public class ClonePair10746 {

    int method1(String str,int startIndex){
      int i=startIndex;
      for (; i < str.length(); i++) {
        if (!Character.isWhitespace(str.charAt(i))) {
          break;
        }
      }
      return i;
    }

    int method2(String dnChain,int startIndex){
      while (startIndex < dnChain.length() && dnChain.charAt(startIndex) == ' ')   startIndex++;
      return startIndex;
    }
}
