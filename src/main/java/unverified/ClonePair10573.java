package unverified;

public class ClonePair10573 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
    }

    String method2(String source,String oldString,String newString){
      if (source == null)   return null;
      StringBuffer output=new StringBuffer();
      int lengOfsource=source.length();
      int lengOfold=oldString.length();
      int posStart=0;
      int pos;
      while ((pos=source.indexOf(oldString,posStart)) >= 0) {
        output.append(source.substring(posStart,pos));
        output.append(newString);
        posStart=pos + lengOfold;
      }
      if (posStart < lengOfsource) {
        output.append(source.substring(posStart));
      }
      return output.toString();
    }
}
