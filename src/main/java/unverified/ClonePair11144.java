package unverified;

public class ClonePair11144 {

    String method1(String str,String from,String to){
      if (str == null)   return str;
      int index=str.indexOf(from);
      if (index == -1)   return str;
      int pos=0;
      final int fromLen=from.length();
      final StringBuilder sb=new StringBuilder();
      while (index > -1) {
        sb.append(str.substring(pos,index)).append(to);
        pos=index + fromLen;
        index=str.indexOf(from,pos);
      }
      sb.append(str.substring(pos));
      return sb.toString();
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
