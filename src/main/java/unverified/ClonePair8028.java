package unverified;

public class ClonePair8028 {

    String method1(byte[] buf,int pos,int len){
      StringBuffer hex=new StringBuffer();
      while (len-- > 0) {
        byte ch=buf[pos++];
        int d=(ch >> 4) & 0xf;
        hex.append((char)(d >= 10 ? 'a' - 10 + d : '0' + d));
        d=ch & 0xf;
        hex.append((char)(d >= 10 ? 'a' - 10 + d : '0' + d));
      }
      return hex.toString();
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
