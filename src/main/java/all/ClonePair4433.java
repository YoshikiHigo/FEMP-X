package all;

public class ClonePair4433 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return ((s2 == null) || s2.equals(""));
      if (s2 == null)   return (s1.equals(""));
      return (s1.equalsIgnoreCase(s2));
    }

    boolean method2(String s1,String s2){
      if ((s1 == null || s1.length() == 0) && (s2 == null || s2.length() == 0)) {
        return true;
      }
      return s1 != null && s2 != null && s1.equals(s2);
    }
}
