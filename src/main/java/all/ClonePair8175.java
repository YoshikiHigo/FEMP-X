package all;

public class ClonePair8175 {

    boolean method1(String first,String second){
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
