package unverified;

public class ClonePair8647 {

    boolean method1(String enc1,String enc2){
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

    boolean method2(String string,String test){
      if (test.length() > string.length())   return (false);
      if (test.equals("") && !string.equals(""))   return (false);
      for (int i=0; i < test.length(); i++) {
        if (Character.toLowerCase(string.charAt(i)) != Character.toLowerCase(test.charAt(i)))     return (false);
      }
      return (true);
    }
}
