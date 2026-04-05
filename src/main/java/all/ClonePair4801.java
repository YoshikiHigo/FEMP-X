package all;

public class ClonePair4801 {

    String method1(String src,char ch,int len){
      StringBuilder out=new StringBuilder(len);
      for (int i=len - src.length(); i > 0; i--) {
        out.append(ch);
      }
      return out.append(src).toString();
    }

    String method2(String in,char padchar,int length){
      StringBuilder builder=new StringBuilder(length);
      for (int x=in.length(); x < length; x++) {
        builder.append(padchar);
      }
      builder.append(in);
      return builder.toString();
    }
}
