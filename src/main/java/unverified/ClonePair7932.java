package unverified;

public class ClonePair7932 {

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

    boolean method2(String enc1,String enc2){
      enc1=enc1.toLowerCase();
      enc2=enc2.toLowerCase();
      if (enc1.endsWith("be") || enc1.endsWith("le")) {
        enc1=enc1.substring(0,enc1.length() - 2);
      }
      if (enc2.endsWith("be") || enc2.endsWith("le")) {
        enc2=enc2.substring(0,enc2.length() - 2);
      }
      return enc1.equals(enc2);
    }
}
