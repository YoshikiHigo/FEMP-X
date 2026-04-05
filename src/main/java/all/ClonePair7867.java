package all;

public class ClonePair7867 {

    boolean method1(String target1,String target2){
      if (target1 == null || target2 == null) {
        return false;
      }
      final int length1=target1.length();
      final int length2=target2.length();
      if (length1 < length2) {
        return false;
      }
      final String s1=target1.substring(length1 - length2);
      return s1.equalsIgnoreCase(target2);
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
