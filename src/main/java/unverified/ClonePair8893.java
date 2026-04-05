package unverified;

public class ClonePair8893 {

    byte[] method1(byte[] data,int beginat,int count){
      byte[] answer=new byte[count];
      int srcidx=beginat;
      for (int destidx=0; destidx < count; destidx++) {
        answer[destidx]=data[srcidx];
        srcidx++;
      }
      return answer;
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
