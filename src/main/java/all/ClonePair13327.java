package all;

public class ClonePair13327 {

    String method1(String str,String f_s,String t_s){
      int pos=0;
      String res="";
      while (pos < str.length()) {
        int p1=str.indexOf(f_s,pos);
        if (p1 == -1) {
          res+=str.substring(pos);
          break;
        }
        res+=str.substring(pos,p1) + t_s;
        pos=p1 + f_s.length();
      }
      return (res);
    }

    String method2(String source,String target,String replacement){
      StringBuffer result=new StringBuffer();
      int index=source.indexOf(target);
      int lastIndex=0;
      if (index >= 0) {
        result.append(source.substring(lastIndex,index));
        result.append(replacement);
        lastIndex=index + target.length();
      }
      if (lastIndex < source.length()) {
        result.append(source.substring(lastIndex));
      }
      return result.toString();
    }
}
