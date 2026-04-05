package all;

public class ClonePair12360 {

    String method1(String string,String placeholder,String replacement){
      if (string == null) {
        return string;
      }
      int loc=string.indexOf(placeholder);
      if (loc < 0) {
        return string;
      }
     else {
        return new StringBuilder(string.substring(0,loc)).append(replacement).append(string.substring(loc + placeholder.length())).toString();
      }
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
