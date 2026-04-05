package unverified;

public class ClonePair11841 {

    String method1(String srcStr,String ch){
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
      if (srcStr.indexOf(ch,0) == 0) {
        srcStr=srcStr.substring(chLen);
      }
      return srcStr;
    }

    String method2(String input,String tail){
      if (input == null || tail == null || !input.endsWith(tail))   return input;
      return input.substring(0,input.length() - tail.length());
    }
}
