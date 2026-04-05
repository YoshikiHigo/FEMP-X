package unverified;

public class ClonePair10877 {

    String method1(String str,int minlen,String padstr){
      if (str.length() < minlen) {
        if (padstr.length() == 0)     return "Zero length padding string used to pad: " + str;
        int extra=minlen - str.length();
        StringBuffer newstr=new StringBuffer(minlen);
        while (newstr.length() < extra)     newstr.append(padstr);
        newstr.setLength(extra);
        newstr.append(str);
        str=newstr.toString();
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
