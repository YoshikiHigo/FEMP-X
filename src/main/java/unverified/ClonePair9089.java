package unverified;

public class ClonePair9089 {

    boolean method1(String text,String prefix){
      int length=prefix.length();
      if (length > text.length())   return false;
      for (int i=0; i < length; i++) {
        char tc=Character.toLowerCase(text.charAt(i));
        char pc=Character.toLowerCase(prefix.charAt(i));
        if (tc != pc)     return false;
      }
      return true;
    }

    boolean method2(String hostname,String certName){
      final boolean isWildcard=certName.startsWith("*.") && certName.indexOf('.') < certName.lastIndexOf('.');
      boolean match=false;
      if (isWildcard) {
        final String certNameDomain=certName.substring(certName.indexOf("."));
        final int hostnameIdx=hostname.indexOf(".") != -1 ? hostname.indexOf(".") : hostname.length();
        final String hostnameDomain=hostname.substring(hostnameIdx);
        match=certNameDomain.equalsIgnoreCase(hostnameDomain);
      }
     else {
        match=certName.equalsIgnoreCase(hostname);
      }
      return match;
    }
}
