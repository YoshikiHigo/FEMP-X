package all;

public class ClonePair7956 {

    String method1(String str,String pad,int length){
      if (str.length() >= length) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str);
      for (int i=str.length(); i < length; i+=pad.length()) {
        buf.append(pad);
      }
      return buf.toString();
    }

    String method2(String str1,String str2,int width){
      if (str1.length() + str2.length() >= width)   return str1 + str2;
      StringBuffer b=new StringBuffer(str1);
      for (int i=0; i < width - (str1.length() + str2.length()); i++)   b.append(" ");
      b.append(str2);
      return b.toString();
    }
}
