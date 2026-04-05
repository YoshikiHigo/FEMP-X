package unverified;

public class ClonePair7763 {

    boolean method1(String str,String suffix){
      if (str == null || suffix == null) {
        return false;
      }
      if (str.endsWith(suffix)) {
        return true;
      }
      if (str.length() < suffix.length()) {
        return false;
      }
      String lcStr=str.substring(str.length() - suffix.length()).toLowerCase();
      String lcSuffix=suffix.toLowerCase();
      return lcStr.equals(lcSuffix);
    }

    boolean method2(String str,String prefix){
      if (str == null || prefix == null)   return false;
      if (str.startsWith(prefix))   return true;
      if (str.length() < prefix.length())   return false;
      String lcStr=str.substring(0,prefix.length()).toLowerCase();
      String lcPrefix=prefix.toLowerCase();
      return lcStr.equals(lcPrefix);
    }
}
