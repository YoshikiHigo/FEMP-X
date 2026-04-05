package all;

public class ClonePair12394 {

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

    String method2(String source,String target,String replacement){
      if (source == null)   return null;
      if (source.equals(""))   return source;
      if (target == null)   return source;
      if (target.equals(""))   return source;
      if (replacement == null)   replacement="";
      int targetLength=target.length();
      int replacementLength=replacement.length();
      StringBuffer sb=new StringBuffer(source);
      int pos=sb.toString().indexOf(target);
      while (pos > -1) {
        sb.replace(pos,(pos + targetLength),replacement);
        pos=sb.toString().indexOf(target,pos + replacementLength);
      }
      return sb.toString();
    }
}
