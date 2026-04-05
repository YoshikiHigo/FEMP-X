package unverified;

public class ClonePair1776 {

    String method1(byte[] data){
      char[] alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
      char[] out=new char[((data.length + 2) / 3) * 4];
      for (int i=0, index=0; i < data.length; i+=3, index+=4) {
        boolean quad=false;
        boolean trip=false;
        int val=(0xFF & data[i]);
        val<<=8;
        if ((i + 1) < data.length) {
          val|=(0xFF & data[i + 1]);
          trip=true;
        }
        val<<=8;
        if ((i + 2) < data.length) {
          val|=(0xFF & data[i + 2]);
          quad=true;
        }
        out[index + 3]=alphabet[(quad ? (val & 0x3F) : 64)];
        val>>=6;
        out[index + 2]=alphabet[(trip ? (val & 0x3F) : 64)];
        val>>=6;
        out[index + 1]=alphabet[val & 0x3F];
        val>>=6;
        out[index + 0]=alphabet[val & 0x3F];
      }
      return new String(out);
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
