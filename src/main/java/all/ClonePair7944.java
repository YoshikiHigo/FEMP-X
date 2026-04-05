package all;

public class ClonePair7944 {

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

    boolean method2(String a,String b){
      if (a == b) {
        return true;
      }
      if (a.length() != b.length())   return false;
      int n=a.length();
      if (n == b.length()) {
        for (int i=n - 1; i >= 0; i--) {
          if (a.charAt(i) != b.charAt(i)) {
            return false;
          }
        }
      }
      return true;
    }
}
