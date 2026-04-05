package unverified;

public class ClonePair8613 {

    boolean method1(String s,String test){
      if (s.length() < test.length())   return false;
      for (int i=0; i < test.length(); i++) {
        if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(test.charAt(i)))     return false;
      }
      return true;
    }

    boolean method2(String str,String op){
      if (str.length() >= op.length()) {
        for (int i=0; i <= str.length() - op.length(); i++) {
          if (i == (str.length() - op.length())) {
            if (str.substring(i).equals(op))         return true;
          }
     else       if (str.substring(i,op.length() + i).equals(op))       return true;
        }
      }
      return false;
    }
}
