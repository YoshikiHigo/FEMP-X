package all;

public class ClonePair6586 {

    boolean method1(String str,String expr){
      if (str == null || expr == null) {
        return false;
      }
      return str.matches(expr);
    }

    boolean method2(String host,String nonProxyHosts){
      if (null == host || null == nonProxyHosts) {
        return false;
      }
      int length=nonProxyHosts.length();
      char ch;
      StringBuilder buf=new StringBuilder(length);
      for (int i=0; i < nonProxyHosts.length(); i++) {
        ch=nonProxyHosts.charAt(i);
    switch (ch) {
    case '.':      buf.append("\\.");
        break;
    case '*':  buf.append(".*");
    break;
    default:buf.append(ch);
    }
    }
    String nonProxyHostsReg=buf.toString();
    return host.matches(nonProxyHostsReg);
    }
}
