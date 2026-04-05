package all;

public class ClonePair10942 {

    String method1(String str,int minlen,String padstr){
      if (str.length() < minlen) {
        if (padstr.length() == 0)     return "Zero length padding string used to pad: " + str;
        while (str.length() < minlen)     str+=padstr;
        if (str.length() > minlen)     str=str.substring(0,minlen);
      }
      return str;
    }

    String method2(String value,int length,String key){
      while (value.getBytes().length < length) {
        value+=key;
      }
      return value;
    }
}
