package unverified;

public class ClonePair10939 {

    String method1(String s,int a_maxChars,String a_appendToEnd){
      if (s == null) {
        return null;
      }
      int len=s.length();
      if (len <= a_maxChars) {
        return s;
      }
      String retour=s.substring(0,a_maxChars);
      if (a_appendToEnd != null) {
        retour+=a_appendToEnd;
      }
      return retour;
    }

    String method2(String str,int truncLen,String lastStr){
      if (str == null)   return str;
      int len=str.length();
      if (len <= truncLen)   return str;
      return str.substring(0,truncLen) + ((lastStr == null) ? "" : lastStr);
    }
}
