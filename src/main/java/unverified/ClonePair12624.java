package unverified;

public class ClonePair12624 {

    String method1(String text,int width){
      if (text.length() == width) {
        return text;
      }
     else   if (text.length() > width) {
        return text.substring(0,width);
      }
     else {
        StringBuffer padded=new StringBuffer(text);
        while (padded.length() < width) {
          padded.append(' ');
        }
        return padded.toString();
      }
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
