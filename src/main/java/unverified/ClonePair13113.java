package unverified;

public class ClonePair13113 {

    String method1(String source,String from,String to){
      StringBuffer sb=new StringBuffer();
      int oldIndex=0, newIndex;
      while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
        sb.append(source.substring(oldIndex,newIndex)).append(to);
        oldIndex=newIndex + from.length();
      }
      if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
      return sb.toString();
    }

    String method2(String line,String from,String to){
      StringBuffer res=new StringBuffer(line.length());
      String tmpstr;
      int ind=-1, lastind=0;
      while ((ind=line.indexOf(from,ind + 1)) != -1) {
        if (lastind < ind) {
          tmpstr=line.substring(lastind,ind);
          res.append(tmpstr);
        }
        res.append(to);
        lastind=ind + from.length();
        ind+=from.length() - 1;
      }
      if (lastind == 0)   return line;
      res.append(line.substring(lastind));
      return res.toString();
    }
}
