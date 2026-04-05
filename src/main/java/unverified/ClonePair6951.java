package unverified;

public class ClonePair6951 {

    boolean method1(String s1,String s2){
      if ((s1 == null) || (s2 == null)) {
        return false;
      }
      return (s1.length() == s2.length()) && (s1.toUpperCase().equals(s2.toUpperCase()));
    }

    boolean method2(String s,String end){
      if ((s == null) || (end == null))   return false;
      if (end.length() > s.length())   return false;
      String temp=s.substring(s.length() - end.length(),s.length());
      if (temp.equalsIgnoreCase(end))   return true;
     else   return false;
    }
}
