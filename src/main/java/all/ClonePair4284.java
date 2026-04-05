package all;

public class ClonePair4284 {

    boolean method1(String exStr,String str){
      int i;
      int j;
      for (i=0, j=0; i < exStr.length(); i++) {
        if (exStr.charAt(i) == '*') {
          return true;
        }
        if (j >= str.length()) {
          return false;
        }
        if (exStr.charAt(i) == '?') {
          j++;
          continue;
        }
     else     if (exStr.charAt(i) != str.charAt(j)) {
          return false;
        }
        j++;
      }
      if (j == str.length()) {
        return true;
      }
     else {
        return false;
      }
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
