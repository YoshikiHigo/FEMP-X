package unverified;

public class ClonePair7940 {

    boolean method1(String s1,String s2){
      s1=s1.trim() + " ";
      s2=s2.trim();
      if (s1.length() < s2.length())   return false;
      if (s2.length() == s1.length())   return s1.equals(s2);
      String[] w2=s2.split(" ");
      int pos=0;
      if (!s1.startsWith(w2[0] + " ")) {
        pos=s1.indexOf(" " + w2[0] + " ");
        if (pos == -1)     return false;
      }
      int k=1;
      while (k < w2.length) {
        String key=" " + w2[k] + " ";
        pos=s1.indexOf(key,pos + 1);
        if (pos == -1)     return false;
        k++;
      }
      return true;
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
