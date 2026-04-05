package unverified;

public class ClonePair10944 {

    String method1(String str,int minlen,String padstr){
      if (str.length() < minlen) {
        if (padstr.length() == 0)     return "Zero length padding string used to pad: " + str;
        while (str.length() < minlen)     str+=padstr;
        if (str.length() > minlen)     str=str.substring(0,minlen);
      }
      return str;
    }

    String method2(String str,int length,String padStr){
      if (str.length() >= length) {
        return str;
      }
      str=padStr + str;
      while (str.length() < length) {
        str+=(padStr + str);
      }
      return str;
    }
}
