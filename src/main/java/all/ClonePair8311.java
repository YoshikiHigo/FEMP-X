package all;

public class ClonePair8311 {

    boolean method1(String str,String suffix){
      if (str == null || suffix == null) {
        return false;
      }
      if (str.startsWith(suffix)) {
        return true;
      }
      if (str.length() < suffix.length()) {
        return false;
      }
      String lcStr=str.substring(str.length() - suffix.length()).toLowerCase();
      String lcPrefix=suffix.toLowerCase();
      return lcStr.equals(lcPrefix);
    }

    boolean method2(String str,String prefix){
      if (str == null || prefix == null) {
        return false;
      }
      if (str.startsWith(prefix)) {
        return true;
      }
      if (str.length() < prefix.length()) {
        return false;
      }
      String lcStr=str.substring(0,prefix.length()).toLowerCase();
      String lcPrefix=prefix.toLowerCase();
      return lcStr.equals(lcPrefix);
    }
}
