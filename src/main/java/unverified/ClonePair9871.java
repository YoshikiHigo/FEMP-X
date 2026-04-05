package unverified;

public class ClonePair9871 {

    String method1(String input,String search,String replace){
      if (input == null || search == null) {
        return input;
      }
      if (replace == null) {
        replace="";
      }
      int index=input.indexOf(search);
      if (index == -1) {
        return input;
      }
      StringBuffer out=new StringBuffer();
      int afterPrev=0;
      while (index != -1) {
        out.append(input.substring(afterPrev,index));
        out.append(replace);
        afterPrev=index + search.length();
        index=input.indexOf(search,afterPrev);
      }
      out.append(input.substring(afterPrev));
      return out.toString();
    }

    String method2(String s,String replaceFrom,String repalceTo){
      if (s == null || replaceFrom == null)   return s;
      if (repalceTo == null)   repalceTo="";
      StringBuffer result=new StringBuffer();
      int index=0;
      int j=0;
      while ((j=s.indexOf(replaceFrom,index)) != -1) {
        result.append(s.substring(index,j));
        result.append(repalceTo);
        index=j + replaceFrom.length();
      }
      if (index == 0) {
        return s;
      }
     else {
        result.append(s.substring(index));
        return result.toString();
      }
    }
}
