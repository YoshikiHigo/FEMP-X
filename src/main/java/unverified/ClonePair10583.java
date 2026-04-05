package unverified;

public class ClonePair10583 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
    }

    String method2(String str,String oldToken,String newToken){
      if (str == null)   return str;
      StringBuilder result=new StringBuilder(str.length() + 100);
      int i=str.indexOf(oldToken);
      int startOfIndex=0;
      for (; i != -1; i=str.indexOf(oldToken,startOfIndex)) {
        result.append(str.substring(startOfIndex,i));
        result.append(newToken);
        startOfIndex=i + oldToken.length();
      }
      result.append(str.substring(startOfIndex,str.length()));
      return result.toString();
    }
}
