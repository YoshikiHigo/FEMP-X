package unverified;

public class ClonePair12398 {

    String method1(String string,String toBeReplaced,String replacement){
      if (string == null || toBeReplaced == null || replacement == null)   return string;
      String tail=string;
      StringBuffer result=new StringBuffer(string.length() + replacement.length());
      int length=toBeReplaced.length();
      int begin;
      while (!tail.equals("")) {
        begin=tail.indexOf(toBeReplaced);
        if (begin == -1) {
          result.append(tail);
          return result.toString();
        }
        result.append(tail.substring(0,begin)).append(replacement);
        tail=tail.substring(begin + length);
      }
      return result.toString();
    }

    String method2(String text,String replace,String replaceTo){
      if (text == null || replace == null || replaceTo == null || replace.length() == 0) {
        return text;
      }
      StringBuffer buf=new StringBuffer(text.length());
      int searchFrom=0;
      while (true) {
        int foundAt=text.indexOf(replace,searchFrom);
        if (foundAt == -1) {
          break;
        }
        buf.append(text.substring(searchFrom,foundAt)).append(replaceTo);
        searchFrom=foundAt + replace.length();
      }
      buf.append(text.substring(searchFrom));
      return buf.toString();
    }
}
