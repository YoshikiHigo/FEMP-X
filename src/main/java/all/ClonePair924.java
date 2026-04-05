package all;

public class ClonePair924 {

    String method1(byte[] buffer,int len){
      StringBuffer buf=new StringBuffer();
      char[] prepend={'0','0'};
      for (int ind=0; ind < len; ind++) {
        String str=Integer.toHexString(buffer[ind] & 0xFF);
        buf.append(prepend,str.length(),2 - str.length());
        buf.append(str);
      }
      return buf.toString();
    }

    String method2(byte[] buf,int length){
      String T="";
      for (int x=0; x < length; x++) {
        int y=buf[x];
        if (y < 0)     y+=256;
        String d=Integer.toHexString(y);
        if (d.length() == 1)     T+="0";
        T+=d;
      }
      return T;
    }
}
