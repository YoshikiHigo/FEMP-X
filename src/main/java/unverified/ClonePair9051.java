package unverified;

public class ClonePair9051 {

    boolean method1(String s,String start){
      if ((s == null) || (start == null)) {
        return false;
      }
      if (start.length() > s.length()) {
        return false;
      }
      String temp=s.substring(0,start.length());
      if (temp.equalsIgnoreCase(start)) {
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
