package all;

public class ClonePair6763 {

    boolean method1(String s1,String s2){
      if (s1 != null && s2 != null)   return s1.toLowerCase().indexOf(s2.toLowerCase()) >= 0;
     else   return false;
    }

    boolean method2(String str,String segment){
      if ((str == null) || (segment == null))   return false;
      if (segment.length() == 0)   return true;
      return str.indexOf(segment) >= 0;
    }
}
