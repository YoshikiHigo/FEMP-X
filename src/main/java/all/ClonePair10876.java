package all;

public class ClonePair10876 {

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

    String method2(String str,int minlen,String padstr){
      if (str.length() < minlen) {
        if (padstr.length() == 0)     return "Zero length padding string used to pad: " + str;
        while (str.length() < minlen)     str+=padstr;
        if (str.length() > minlen)     str=str.substring(0,minlen);
      }
      return str;
    }
}
