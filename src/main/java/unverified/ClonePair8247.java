package unverified;

public class ClonePair8247 {

    boolean method1(String aMatchExpression,String aString){
      int expressionLength=aMatchExpression.length();
      for (int i=0; i < expressionLength; i++) {
        char expChar=aMatchExpression.charAt(i);
        if (expChar == '*')     return true;
        if (i == aString.length())     return false;
        if (expChar == '?')     continue;
        if (expChar != aString.charAt(i))     return false;
      }
      return (expressionLength == aString.length());
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
