package all;

import java.util.*;

public class ClonePair8180 {

    boolean method1(String s1,String s2){
      StringTokenizer st1=new StringTokenizer(s1);
      StringTokenizer st2=new StringTokenizer(s2);
      while (st1.hasMoreTokens()) {
        if (!st2.hasMoreTokens())     return false;
        if (!st1.nextToken().equals(st2.nextToken()))     return false;
      }
      if (st2.hasMoreTokens())   return false;
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
