package all;

public class ClonePair10941 {

    String method1(String string,int maximumLength,String suffix){
      if (string == null) {
        return string;
      }
      int stringLength=string.length();
      if (stringLength <= maximumLength) {
        return string;
      }
      return string.substring(0,maximumLength) + (suffix == null ? "" : suffix);
    }

    String method2(String str,int truncLen,String lastStr){
      if (str == null)   return str;
      int len=str.length();
      if (len <= truncLen)   return str;
      return str.substring(0,truncLen) + ((lastStr == null) ? "" : lastStr);
    }
}
