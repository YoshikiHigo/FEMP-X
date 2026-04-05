package unverified;

public class ClonePair8793 {

    byte[] method1(byte[] input,int offset,int length){
      byte[] sub=new byte[length];
      for (int i=offset; i < offset + length; i++) {
        sub[i - offset]=input[i];
      }
      return sub;
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
