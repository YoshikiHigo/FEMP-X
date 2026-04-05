package all;

public class ClonePair4217 {

    boolean method1(String target1,String target2){
      if (target1 == null || target2 == null) {
        return false;
      }
      final int length1=target1.length();
      final int length2=target2.length();
      if (length1 < length2) {
        return false;
      }
      final String s1=target1.substring(0,target2.length());
      return s1.equalsIgnoreCase(target2);
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
