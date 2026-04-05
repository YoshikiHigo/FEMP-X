package all;

public class ClonePair9262 {

    boolean method1(String s1,String s2){
      if (s1.length() < s2.length())   return false;
      for (int i=0; i < s2.length(); i++) {
        char c1=s1.charAt(i), c2=s2.charAt(i);
        if (c1 != c2 && Character.toLowerCase(c2) != c1 && Character.toUpperCase(c2) != c1)     return false;
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
