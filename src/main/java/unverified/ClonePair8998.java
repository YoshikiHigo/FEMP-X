package unverified;

public class ClonePair8998 {

    boolean method1(String s1,String s2){
      if (s1.length() != s2.length()) {
        System.out.println("Compare failed: lengths differ");
        return false;
      }
      for (int i=0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
          System.out.println("Compare failed: bytes at " + i + " differ ["+ s1.charAt(i)+ "] ["+ s2.charAt(i)+ "]");
          return false;
        }
      }
      return true;
    }

    boolean method2(String string,String test){
      if (test.length() > string.length())   return (false);
      if (test.equals("") && !string.equals(""))   return (false);
      for (int i=0; i < test.length(); i++) {
        if (Character.toLowerCase(string.charAt(i)) != Character.toLowerCase(test.charAt(i)))     return (false);
      }
      return (true);
    }
}
