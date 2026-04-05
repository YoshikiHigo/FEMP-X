package unverified;

public class ClonePair5934 {

    boolean method1(String str,String suffix){
      if (str == null || suffix == null)   return false;
      if (str.endsWith(suffix))   return true;
      if (str.length() < suffix.length())   return false;
      String lcStr=str.substring(str.length() - suffix.length()).toLowerCase();
      String lcSuffix=suffix.toLowerCase();
      return lcStr.equals(lcSuffix);
    }

    boolean method2(String s,String end){
      if ((s == null) || (end == null))   return false;
      if (end.length() > s.length())   return false;
      String temp=s.substring(s.length() - end.length(),s.length());
      if (temp.equalsIgnoreCase(end))   return true;
     else   return false;
    }
}
