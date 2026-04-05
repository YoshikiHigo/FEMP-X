package all;

public class ClonePair12907 {

    String method1(String str,String pattern,String replace){
      if (replace == null) {
        replace="";
      }
      int s=0, e=0;
      StringBuffer result=new StringBuffer();
      while ((e=str.indexOf(pattern,s)) >= 0) {
        result.append(str.substring(s,e));
        result.append(replace);
        s=e + pattern.length();
      }
      if (s == 0)   return str;
      result.append(str.substring(s));
      return result.toString();
    }

    String method2(String lookIn,String lookFor,String replaceWith){
      int count=0;
      int i, j;
      StringBuffer sb;
      for (i=0; (i=lookIn.indexOf(lookFor,i)) != -1; i+=lookFor.length())   ++count;
      if (count == 0) {
        return lookIn;
      }
      sb=new StringBuffer(lookIn.length() + count * (replaceWith.length() - lookFor.length()));
      for (i=0; (j=lookIn.indexOf(lookFor,i)) != -1; i=j + lookFor.length())   sb.append(lookIn.substring(i,j)).append(replaceWith);
      sb.append(lookIn.substring(i));
      return sb.toString();
    }
}
