package unverified;

public class ClonePair13457 {

    String method1(String s,String what,String onWhat){
      if (s == null) {
        return null;
      }
      String res;
      int i;
      i=s.lastIndexOf(what);
      if (i < 0) {
        return s;
      }
      res=s.substring(0,i) + onWhat + s.substring(i + what.length());
      return res;
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
