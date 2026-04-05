package unverified;

public class ClonePair12038 {

    String method1(String source,String mark,String toMark){
      String result=source;
      int p=0;
      while (source != null && mark != null && toMark != null) {
        p=result.indexOf(mark,p);
        if (p == -1) {
          break;
        }
        result=result.substring(0,p) + toMark + result.substring(p + mark.length());
        p+=toMark.length();
      }
      return result;
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
