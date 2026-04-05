package all;

public class ClonePair8309 {

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

    boolean method2(String value,String suffix){
      if ((value == null) || (suffix == null)) {
        return false;
      }
      if (suffix.length() > value.length()) {
        return false;
      }
      return value.substring(value.length() - suffix.length()).equals(suffix);
    }
}
