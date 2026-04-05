package all;

public class ClonePair11852 {

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

    String method2(String orig,String compare){
      if (orig == null) {
        return null;
      }
      if (compare == null) {
        return orig;
      }
      int origLaenge=orig.length();
      if (compare.length() <= origLaenge && compare.equalsIgnoreCase(orig.substring(origLaenge - compare.length(),origLaenge))) {
        return orig.substring(0,orig.length() - compare.length());
      }
      return orig;
    }
}
