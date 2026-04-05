package all;

public class ClonePair12698 {

    String method1(String input,String tail){
      if (input == null || tail == null || !input.endsWith(tail))   return input;
      return input.substring(0,input.length() - tail.length());
    }

    String method2(String srcStr,String cutStr){
      if (srcStr == null || cutStr == null) {
        return srcStr;
      }
      String retStr=srcStr;
      if (retStr.endsWith(cutStr)) {
        retStr=retStr.substring(0,retStr.length() - cutStr.length());
      }
      return retStr;
    }
}
