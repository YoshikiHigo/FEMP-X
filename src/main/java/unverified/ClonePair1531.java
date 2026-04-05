package unverified;

public class ClonePair1531 {

    String method1(byte[] b){
      StringBuffer sb=new StringBuffer((b.length / 3) * 4);
      int i=0;
      int remaining=b.length;
      char c[]=new char[4];
      while (remaining > 0) {
        c[0]=(char)((b[i] & 0xFC) >> 2);
        c[1]=(char)((b[i] & 0x03) << 4);
        if (remaining >= 2) {
          c[1]+=(char)((b[i + 1] & 0xF0) >> 4);
          c[2]=(char)((b[i + 1] & 0x0F) << 2);
          if (remaining >= 3) {
            c[2]+=(char)((b[i + 2] & 0xC0) >> 6);
            c[3]=(char)(b[i + 2] & 0x3F);
          }
     else {
            c[3]=64;
          }
        }
     else {
          c[2]=64;
          c[3]=64;
        }
        for (int j=0; j < 4; j++) {
          if (c[j] < 26) {
            c[j]+='A';
          }
     else       if (c[j] < 52) {
            c[j]=(char)(c[j] - 26 + 'a');
          }
     else       if (c[j] < 62) {
            c[j]=(char)(c[j] - 52 + '0');
          }
     else       if (c[j] == 62) {
            c[j]='+';
          }
     else       if (c[j] == 63) {
            c[j]='/';
          }
     else {
            c[j]='=';
          }
        }
        sb.append(c);
        i+=3;
        remaining-=3;
      }
      return sb.toString();
    }

    String method2(byte[] aValue){
      final String m_strBase64Chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
      int byte1;
      int byte2;
      int byte3;
      int iByteLen=aValue.length;
      StringBuffer tt=new StringBuffer();
      for (int i=0; i < iByteLen; i+=3) {
        boolean bByte2=(i + 1) < iByteLen;
        boolean bByte3=(i + 2) < iByteLen;
        byte1=aValue[i] & 0xFF;
        byte2=(bByte2) ? (aValue[i + 1] & 0xFF) : 0;
        byte3=(bByte3) ? (aValue[i + 2] & 0xFF) : 0;
        tt.append(m_strBase64Chars.charAt(byte1 / 4));
        tt.append(m_strBase64Chars.charAt((byte2 / 16) + ((byte1 & 0x3) * 16)));
        tt.append(((bByte2) ? m_strBase64Chars.charAt((byte3 / 64) + ((byte2 & 0xF) * 4)) : '='));
        tt.append(((bByte3) ? m_strBase64Chars.charAt(byte3 & 0x3F) : '='));
      }
      return tt.toString();
    }
}
