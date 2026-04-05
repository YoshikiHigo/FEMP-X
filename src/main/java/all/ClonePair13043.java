package all;

public class ClonePair13043 {

    String method1(String s,String find,String replace){
      if (s == null)   return s;
      StringBuffer result=new StringBuffer();
      int index;
      while ((index=s.indexOf(find)) >= 0) {
        result.append(s.substring(0,index));
        result.append(replace);
        s=s.substring(index + find.length());
      }
      result.append(s);
      return result.toString();
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
