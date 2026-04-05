package all;

public class ClonePair6246 {

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

    boolean method2(String s1,String s2){
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
}
