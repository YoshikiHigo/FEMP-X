package all;

public class ClonePair12714 {

    String method1(String input,String tail){
      if (input == null || tail == null || !input.endsWith(tail))   return input;
      return input.substring(0,input.length() - tail.length());
    }

    String method2(String srcStr,String ch){
      if ((srcStr == null) || ("".equals(srcStr.trim()))) {
        return srcStr;
      }
      if ((ch == null) || ("".equals(ch))) {
        return srcStr;
      }
      if (ch.length() > srcStr.length()) {
        return srcStr;
      }
      if (srcStr.indexOf(ch) < 0) {
        return srcStr;
      }
      int chLen=ch.length();
      int strLen=srcStr.length();
      if (srcStr.indexOf(ch,strLen - chLen) == strLen - chLen) {
        srcStr=srcStr.substring(0,strLen - chLen);
        strLen=srcStr.length();
      }
      return srcStr;
    }
}
