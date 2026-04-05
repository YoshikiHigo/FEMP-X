package all;

public class ClonePair12407 {

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

    String method2(String str,String match,String to){
      if ((str == null) || (match == null) || (to == null)) {
        return str;
      }
      StringBuffer dest=new StringBuffer();
      int len=match.length();
      String org=str;
      int index=org.indexOf(match);
      while (index != -1) {
        dest.append(org.substring(0,index));
        dest.append(to);
        org=org.substring(index + len);
        index=org.indexOf(match);
      }
      dest.append(org);
      return dest.toString();
    }
}
