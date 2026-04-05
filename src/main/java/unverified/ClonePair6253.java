package unverified;

public class ClonePair6253 {

    int method1(byte[] buf,int off,boolean bigEndian){
      int val;
      if (bigEndian) {
        val=(((int)buf[off]) << 8) & 0x0000FF00;
        val|=(((int)buf[++off])) & 0x000000FF;
      }
     else {
        val=(((int)buf[off])) & 0x000000FF;
        val|=(((int)buf[++off]) << 8) & 0x0000FF00;
      }
      return (val);
    }

    int method2(byte[] buffer,int offset,boolean bigEndian){
      if (bigEndian) {
        return ((buffer[offset] & 0xFF) << 8) | (buffer[offset + 1] & 0xFF);
      }
     else {
        return ((buffer[offset + 1] & 0xFF) << 8) | (buffer[offset] & 0xFF);
      }
    }
}
