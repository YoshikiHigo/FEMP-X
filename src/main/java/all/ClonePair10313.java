package all;

public class ClonePair10313 {

    String method1(String str,String s1,String s2){
      if (str.equals(s1))   return s2;
     else   if (!str.endsWith(s1))   return str;
      int pos=str.lastIndexOf(s1);
      if (pos < 0)   return str;
      return str.substring(0,str.length() - s1.length()) + s2;
    }

    String method2(String input,String search,String replacement){
      int pos=input.indexOf(search);
      if (pos != -1) {
        int lastPos=pos;
        while (true) {
          pos=input.indexOf(search,lastPos + 1);
          if (pos == -1) {
            break;
          }
     else {
            lastPos=pos;
          }
        }
        input=input.substring(0,lastPos) + replacement + input.substring(lastPos + search.length());
      }
      return input;
    }
}
