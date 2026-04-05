package all;

public class ClonePair11656 {

    String method1(String in,String what,String with){
      int pos=0, lp=0;
      StringBuffer sb=new StringBuffer();
      while ((pos=in.indexOf(what,lp)) > -1) {
        sb.append(in.substring(lp,pos));
        sb.append(with);
        lp=pos + what.length();
      }
      if (lp < in.length()) {
        sb.append(in.substring(lp));
      }
      return sb.toString();
    }

    String method2(String input,String search,String replacement){
      int pos=input.indexOf(search);
      if (pos != -1) {
        int lastPos=pos;
        while (true) {
          pos=input.indexOf(search,lastPos + 1);
          if (pos == -1) {
            break;
          }
     else {
            lastPos=pos;
          }
        }
        input=input.substring(0,lastPos) + replacement + input.substring(lastPos + search.length());
      }
      return input;
    }
}
