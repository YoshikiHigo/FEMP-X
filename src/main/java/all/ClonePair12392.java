package all;

public class ClonePair12392 {

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

    String method2(String src,String from,String to){
      StringBuffer res_Buff=new StringBuffer();
      int pos=-1;
      if (src == null || from == null || from.equals(""))   return src;
      if (to == null)   to="";
      while (true) {
        if ((pos=src.indexOf(from)) == -1) {
          res_Buff.append(src);
          break;
        }
        res_Buff.append(src.substring(0,pos)).append(to);
        src=src.substring(pos + from.length());
      }
      return res_Buff.toString();
    }
}
