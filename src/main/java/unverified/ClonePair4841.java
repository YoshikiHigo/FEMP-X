package unverified;

public class ClonePair4841 {

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
