package unverified;

public class ClonePair8629 {

    boolean method1(String s,String test){
      if (s.length() < test.length())   return false;
      for (int i=0; i < test.length(); i++) {
        if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(test.charAt(i)))     return false;
      }
      return true;
    }

    boolean method2(String target,String lastStr){
      int tarlength=target.length();
      int lastStrlength=lastStr.length();
      if (target.indexOf(lastStr) != -1) {
        int ind=target.lastIndexOf(lastStr);
        if (ind + 1 + lastStrlength >= tarlength) {
          return true;
        }
     else {
          return false;
        }
      }
     else {
        return false;
      }
    }
}
