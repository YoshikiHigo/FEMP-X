package all;

public class ClonePair8993 {

    int method1(String dnChain,int startIndex){
      while (startIndex < dnChain.length() && dnChain.charAt(startIndex) == ' ') {
        startIndex++;
      }
      return startIndex;
    }

    int method2(String rawdata,int i){
      int length=rawdata.length();
      while ((i < length) && Character.isWhitespace(rawdata.charAt(i)))   i++;
      return i;
    }
}
