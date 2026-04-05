package unverified;

public class ClonePair6249 {

    boolean method1(String a,String b){
      if (a == b) {
        return true;
      }
      int n=a.length();
      if (n == b.length()) {
        while (--n >= 0) {
          if (a.charAt(n) != b.charAt(n))       return false;
        }
        return true;
      }
      return false;
    }

    boolean method2(String string1,String string2){
      if (string2.length() != string1.length())   return (false);
      for (int i=0; i < string2.length(); i++) {
        if (Character.toLowerCase(string1.charAt(i)) != Character.toLowerCase(string2.charAt(i)))     return (false);
      }
      return (true);
    }
}
