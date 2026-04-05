package unverified;

public class ClonePair8030 {

    String method1(byte[] array,int offset,int length){
      String result="";
      for (int i=offset; i < (offset + length); ++i) {
        byte b=array[i];
        String currentHexString=Integer.toHexString(b & 0xFF);
        if (currentHexString.length() == 1)     currentHexString="0" + currentHexString;
        result+=currentHexString;
      }
      return result;
    }

    String method2(byte[] sysex,int ofs,int len){
      StringBuffer patchstring=new StringBuffer();
      for (int i=ofs; i < ofs + len; i++) {
        if ((int)(sysex[i] & 0xff) < 0x10)     patchstring.append("0");
        patchstring.append(Integer.toHexString((int)(sysex[i] & 0xff)));
      }
      return patchstring.toString();
    }
}
