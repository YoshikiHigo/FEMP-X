package unverified;

public class ClonePair4825 {

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
      String lcStr=str.substring(suffix.length()).toLowerCase();
      String lcSuffix=suffix.toLowerCase();
      return lcStr.equals(lcSuffix);
    }

    boolean method2(String str,String suffix){
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
}
