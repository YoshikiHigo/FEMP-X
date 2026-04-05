package all;

public class ClonePair12877 {

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

    String method2(String original,String regex,String replacement){
      int index=0;
      String newString=original;
      while ((newString.contains(regex)) && (regex.compareTo(replacement) != 0)) {
        index=newString.indexOf(regex);
        newString=newString.substring(0,index) + replacement + newString.substring(index + regex.length(),newString.length());
      }
      return newString;
    }
}
