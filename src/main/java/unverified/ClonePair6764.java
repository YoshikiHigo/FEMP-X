package unverified;

public class ClonePair6764 {

    boolean method1(String s1,String s2){
      if (s1 != null && s2 != null)   return s1.toLowerCase().indexOf(s2.toLowerCase()) >= 0;
     else   return false;
    }

    boolean method2(String str,String searchStr){
      if (str == null || searchStr == null) {
        return false;
      }
      return str.indexOf(searchStr) >= 0;
    }
}
