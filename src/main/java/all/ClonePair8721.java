package all;

public class ClonePair8721 {

    String method1(String input,String[] wordList,int numChars){
      if (input == null || "".equals(input.trim()) || wordList == null || wordList.length == 0 || numChars == 0) {
        return "";
      }
      String lc=input.toLowerCase();
      for (  String aWordList : wordList) {
        int pos=lc.indexOf(aWordList);
        if (pos > -1) {
          int beginIdx=pos - numChars;
          if (beginIdx < 0) {
            beginIdx=0;
          }
          int endIdx=pos + numChars;
          if (endIdx > input.length() - 1) {
            endIdx=input.length() - 1;
          }
          char[] chars=input.toCharArray();
          while (beginIdx > 0 && chars[beginIdx] != ' ' && chars[beginIdx] != '\n' && chars[beginIdx] != '\r') {
            beginIdx--;
          }
          while (endIdx < input.length() && chars[endIdx] != ' ' && chars[endIdx] != '\n' && chars[endIdx] != '\r') {
            endIdx++;
          }
          return input.substring(beginIdx,endIdx);
        }
      }
      return input.substring(0,(input.length() >= 200) ? 200 : input.length());
    }

    String method2(String input,String[] wordList,int numChars){
      if (input == null || "".equals(input.trim()) || wordList == null || wordList.length == 0 || numChars == 0)   return "";
      String lc=input.toLowerCase();
      for (  String aWordList : wordList) {
        int pos=lc.indexOf(aWordList);
        if (pos > -1) {
          int beginIdx=pos - numChars;
          if (beginIdx < 0)       beginIdx=0;
          int endIdx=pos + numChars;
          if (endIdx > input.length() - 1)       endIdx=input.length() - 1;
          char[] chars=input.toCharArray();
          while (beginIdx > 0 && chars[beginIdx] != ' ' && chars[beginIdx] != '\n' && chars[beginIdx] != '\r')       beginIdx--;
          while (endIdx < input.length() && chars[endIdx] != ' ' && chars[endIdx] != '\n' && chars[endIdx] != '\r')       endIdx++;
          return input.substring(beginIdx,endIdx);
        }
      }
      return input.substring(0,(input.length() >= 200) ? 200 : input.length());
    }
}
