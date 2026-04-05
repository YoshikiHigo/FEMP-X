package all;

public class ClonePair1921 {

    String method1(byte[] value){
      String ret="";
      for (int i=0; i < value.length; i++) {
        if (value[i] >= 32 && value[i] <= 126)     ret=ret + ((char)value[i]);
     else     ret=ret.concat(".");
      }
      return ret;
    }

    String method2(byte[] in){
      StringBuilder buf=new StringBuilder();
      for (int i=0; i < in.length; i++) {
        if (in[i] >= (byte)0x20 && in[i] < (byte)0x7F) {
          buf.append((char)in[i]);
        }
     else {
          buf.append(".");
        }
      }
      return buf.toString();
    }
}
