package all;

public class ClonePair10933 {

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

    String method2(String string,int maximumLength,String suffix){
      if (string == null) {
        return string;
      }
      int stringLength=string.length();
      if (stringLength <= maximumLength) {
        return string;
      }
      return string.substring(0,maximumLength) + (suffix == null ? "" : suffix);
    }
}
