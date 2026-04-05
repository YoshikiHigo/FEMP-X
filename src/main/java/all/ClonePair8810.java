package all;

public class ClonePair8810 {

    boolean method1(String s,String end){
      if ((s == null) || (end == null)) {
        return false;
      }
      if (end.length() > s.length()) {
        return false;
      }
      String temp=s.substring(s.length() - end.length(),s.length());
      if (temp.equalsIgnoreCase(end)) {
        return true;
      }
     else {
        return false;
      }
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
