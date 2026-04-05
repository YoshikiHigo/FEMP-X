package all;

public class ClonePair12792 {

    byte[] method1(int c){
      if (c < 0x80)   return new byte[]{(byte)c};
      byte[] buf;
      if (c < 0x800) {
        buf=new byte[2];
        buf[0]=(byte)((c >> 6) | (0x80 | 0x40));
      }
     else   if (c < 0x10000) {
        buf=new byte[3];
        buf[0]=(byte)((c >> (2 * 6)) | (0x80 | 0x40 | 0x20));
      }
     else {
        buf=new byte[4];
        buf[0]=(byte)((c >> (3 * 6)) | (0x80 | 0x40 | 0x20| 0x10));
      }
      for (int i=buf.length - 1; i > 0; i--) {
        buf[i]=(byte)((c & 0x3F) | 0x80);
        c>>=6;
      }
      return buf;
    }

    byte[] method2(int ch){
      int bytesNeeded=0;
      if (ch < 0x80) {
        ++bytesNeeded;
      }
     else   if (ch < 0x0800) {
        bytesNeeded+=2;
      }
     else   if (ch < 0x10000) {
        bytesNeeded+=3;
      }
     else {
        bytesNeeded+=4;
      }
      byte[] utf8=new byte[bytesNeeded];
      int bytes=0;
      if (ch < 0x80) {
        utf8[bytes++]=(byte)ch;
      }
     else   if (ch < 0x0800) {
        utf8[bytes++]=(byte)(ch >> 6 | 0xC0);
        utf8[bytes++]=(byte)(ch & 0x3F | 0x80);
      }
     else   if (ch < 0x10000) {
        utf8[bytes++]=(byte)(ch >> 12 | 0xE0);
        utf8[bytes++]=(byte)(ch >> 6 & 0x3F | 0x80);
        utf8[bytes++]=(byte)(ch & 0x3F | 0x80);
      }
     else {
        utf8[bytes++]=(byte)(ch >> 18 | 0xF0);
        utf8[bytes++]=(byte)(ch >> 12 & 0x3F | 0x80);
        utf8[bytes++]=(byte)(ch >> 6 & 0x3F | 0x80);
        utf8[bytes++]=(byte)(ch & 0x3F | 0x80);
      }
      return utf8;
    }
}
