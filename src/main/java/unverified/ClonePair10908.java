package unverified;

public class ClonePair10908 {

    String method1(String someString,int number,String fillString){
      if (someString.length() < number) {
        StringBuffer sb=new StringBuffer();
        sb.append(someString);
        int totalLength=someString.length();
        while (totalLength < number) {
          sb.append(fillString);
          totalLength+=fillString.length();
        }
        return sb.toString();
      }
      return someString;
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
