package unverified;

public class ClonePair12137 {

    String method1(String input,String replace,String replacement){
      if (replace.equals(replacement))   return input;
      int idx;
      if ((idx=input.indexOf(replace)) == -1) {
        return input;
      }
      boolean finished=false;
      while (!finished) {
        StringBuffer returning=new StringBuffer();
        while (idx != -1) {
          returning.append(input.substring(0,idx));
          returning.append(replacement);
          input=input.substring(idx + replace.length());
          idx=input.indexOf(replace);
        }
        returning.append(input);
        input=returning.toString();
        if ((idx=returning.indexOf(replace)) == -1) {
          finished=true;
        }
      }
      return input;
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
