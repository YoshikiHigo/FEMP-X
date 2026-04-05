package unverified;

public class ClonePair13453 {

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

    String method2(String src,String oldstr,String newstr){
      if (src == null) {
        return null;
      }
      StringBuffer dest=new StringBuffer("");
      int len=oldstr.length();
      int srclen=src.length();
      int pos;
      int oldpos;
      for (oldpos=0; (pos=src.indexOf(oldstr,oldpos)) >= 0; oldpos=pos + len) {
        dest.append(src.substring(oldpos,pos));
        dest.append(newstr);
      }
      if (oldpos < srclen) {
        dest.append(src.substring(oldpos,srclen));
      }
      return dest.toString();
    }
}
