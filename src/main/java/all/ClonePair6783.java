package all;

public class ClonePair6783 {

    boolean method1(String string1,String string2){
      if (string1 == null || string1.trim().equals(""))   return true;
      if (string2 == null || string2.trim().equals(""))   return true;
      return false;
    }

    boolean method2(String s1,String s2){
      if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) {
        return true;
      }
      return s1.equals(s2);
    }
}
