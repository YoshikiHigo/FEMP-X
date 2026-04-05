package unverified;

public class ClonePair9843 {

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
