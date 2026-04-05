package unverified;

public class ClonePair8068 {

    String method1(byte[] sysex,int ofs,int len){
      StringBuffer patchstring=new StringBuffer();
      for (int i=ofs; i < ofs + len; i++) {
        if ((int)(sysex[i] & 0xff) < 0x10)     patchstring.append("0");
        patchstring.append(Integer.toHexString((int)(sysex[i] & 0xff)));
      }
      return patchstring.toString();
    }

    String method2(byte[] b,int i,int j){
      String temp="";
      for (int cntr=0; cntr < j; cntr++) {
        int num=b[i + cntr] & 0xFF;
        String myStr;
        if (num < 16)     myStr="0";
     else     myStr="";
        temp+=myStr + Integer.toHexString(num) + " ";
      }
      return temp.toUpperCase().trim();
    }
}
