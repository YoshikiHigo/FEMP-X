package all;

public class ClonePair3192 {

    String method1(double value,int decimals){
      String doubleStr="" + value;
      int index=doubleStr.indexOf(".") != -1 ? doubleStr.indexOf(".") : doubleStr.indexOf(",");
      if (index == -1) {
        return doubleStr;
      }
      if (decimals == 0) {
        return doubleStr.substring(0,index);
      }
      int len=index + decimals + 1;
      if (len >= doubleStr.length()) {
        len=doubleStr.length();
      }
      double d=Double.parseDouble(doubleStr.substring(0,len));
      return String.valueOf(d);
    }

    String method2(double value,int decimals){
      String doubleStr="" + value;
      int index=doubleStr.indexOf(".") != -1 ? doubleStr.indexOf(".") : doubleStr.indexOf(",");
      if (index == -1)   return doubleStr;
      if (decimals == 0) {
        return doubleStr.substring(0,index);
      }
      int len=index + decimals + 1;
      if (len >= doubleStr.length())   len=doubleStr.length();
      double d=Double.parseDouble(doubleStr.substring(0,len));
      return String.valueOf(d);
    }
}
