package unverified;

public class ClonePair8890 {

    byte[] method1(byte[] array,int start,int len){
      byte[] buffer=new byte[len];
      for (int x=0; x < len; x++)   buffer[x]=array[start + x];
      return buffer;
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
