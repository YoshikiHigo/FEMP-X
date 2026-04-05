package unverified;

public class ClonePair7928 {

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

    boolean method2(String first,String second){
      boolean result=false;
      if (first.length() == 0) {
        return second.length() == 0;
      }
      if (second.length() == 0) {
        return first.length() == 0;
      }
      if (first.charAt(0) == '+') {
        first=first.substring(1);
      }
      if (second.charAt(0) == '+') {
        second=second.substring(1);
      }
      try {
        double d1=Double.parseDouble(first);
        double d2=Double.parseDouble(second);
        if (d1 == d2) {
          result=true;
        }
      }
     catch (  NumberFormatException e) {
        result=first.equals(second);
      }
      return result;
    }
}
