package unverified;

public class ClonePair8844 {

    byte[] method1(byte[] data,int offset,int len){
      final byte[] buf=new byte[len];
      for (int i=0; i < buf.length; ++i)   buf[i]=data[offset + i];
      return buf;
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
