package unverified;

public class ClonePair12926 {

    String method1(String s,int length){
      if (s.length() < length) {
        StringBuffer str=new StringBuffer(s);
        for (int i=0; i < length - s.length(); i++) {
          str.append(" ");
        }
        s=str.toString();
      }
     else   if (s.length() > length) {
        s=s.substring(0,length);
      }
      return s;
    }

    String method2(String printThis,int width){
      String out="";
      if (printThis.length() > width) {
        out+=printThis.substring(0,width);
      }
     else {
        out+=printThis;
        String pad="";
        for (int i=width - printThis.length(); i > 0; i--) {
          pad+=" ";
        }
        out+=pad;
      }
      return out;
    }
}
