package all;

public class ClonePair12639 {

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

    String method2(String str,int len){
      if (str.length() > len)   return str.substring(0,len);
      for (int i=str.length(); i < len; i++)   str+="&nbsp;";
      return str;
    }
}
