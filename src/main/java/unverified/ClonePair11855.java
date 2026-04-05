package unverified;

public class ClonePair11855 {

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

    String method2(String text,String suffix){
      if (text == null) {
        return null;
      }
      if (suffix == null) {
        return text;
      }
      if (text.endsWith(suffix)) {
        return text.substring(0,text.length() - suffix.length());
      }
      return text;
    }
}
