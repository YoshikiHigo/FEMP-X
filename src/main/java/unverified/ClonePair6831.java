package unverified;

public class ClonePair6831 {

    boolean method1(String pattern,String key){
      if (key.length() < pattern.length())   return false;
      for (int i=0; i < pattern.length(); i++) {
        char format=pattern.charAt(i);
        char ch=key.charAt(i);
        if (!((format == '#' && Character.isDigit(ch)) || (format == ch))) {
          return false;
        }
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
