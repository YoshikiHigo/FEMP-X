package all;

public class ClonePair13040 {

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

    String method2(String str,String from,String to){
      if (str == null || str.length() == 0) {
        return str;
      }
     else   if (str.length() == 1 && str.equals(from)) {
        return to;
      }
     else   if (str.length() == 1 && !str.equals(from)) {
        return str;
      }
      int j=-1;
      while ((j=str.indexOf(from)) >= 0) {
        str=str.substring(0,j) + (char)5 + str.substring(j + from.length());
      }
      int i=-1;
      while ((i=str.indexOf((char)5)) >= 0) {
        str=str.substring(0,i) + to + str.substring(i + 1);
      }
      return str;
    }
}
