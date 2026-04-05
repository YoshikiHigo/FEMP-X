package all;

public class ClonePair8837 {

    byte[] method1(byte[] buf,int offset,int len){
      byte[] translated=new byte[len];
      for (int j=0; j < len; j++) {
        byte b=buf[offset + j];
        if (b == '/')     translated[j]=(byte)'.';
     else     translated[j]=b;
      }
      return translated;
    }

    byte[] method2(byte[] octets,int bitSkip,int septetCount){
      byte[] septets=new byte[septetCount];
      for (int newIndex=septets.length - 1; newIndex >= 0; --newIndex) {
        for (int bit=6; bit >= 0; --bit) {
          int oldBitIndex=((newIndex * 7) + bit) + bitSkip;
          if ((octets[oldBitIndex >>> 3] & (1 << (oldBitIndex & 7))) != 0)       septets[newIndex]|=(1 << bit);
        }
      }
      return septets;
    }
}
