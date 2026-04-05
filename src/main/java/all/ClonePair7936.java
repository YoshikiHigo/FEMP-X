package all;

public class ClonePair7936 {

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
      int len1=s1.length(), len2=s2.length();
      int len=len1 < len2 ? len1 : len2;
      if (len2 > len1 + 1 || len1 > len2 + 1)   return false;
      for (int i=0; i < len; i++) {
        if (s1.charAt(i) != s2.charAt(i))     return false;
      }
      if (len1 > len2 && s1.charAt(len1 - 1) != ' ' || len1 < len2 && s2.charAt(len2 - 1) != ' ')   return false;
      return true;
    }
}
