package all;

public class ClonePair6366 {

    long method1(byte[] buffer,int offset){
      long qWord=(((long)(buffer[offset + 7] & 0x7f) << 56) | ((long)(buffer[offset + 6] & 0x7f) << 48) | ((long)(buffer[offset + 5] & 0x7f) << 40)| ((long)(buffer[offset + 4] & 0x7f) << 32)| ((buffer[offset + 3] & 0x7f) << 24)| ((buffer[offset + 2] & 0x7f) << 16)| ((buffer[offset + 1] & 0x7f) << 8)| (buffer[offset] & 0x7f));
      if (buffer[offset + 7] < 0)   qWord|=0x8000000000000000L;
      if (buffer[offset + 6] < 0)   qWord|=0x0080000000000000L;
      if (buffer[offset + 5] < 0)   qWord|=0x0000800000000000L;
      if (buffer[offset + 4] < 0)   qWord|=0x0000008000000000L;
      if (buffer[offset + 3] < 0)   qWord|=0x0000000080000000L;
      if (buffer[offset + 2] < 0)   qWord|=0x0000000000800000L;
      if (buffer[offset + 1] < 0)   qWord|=0x0000000000008000L;
      if (buffer[offset] < 0)   qWord|=0x0000000000000080L;
      return qWord;
    }

    long method2(byte[] b,int offset){
      long accum=0;
      long shiftedval;
      for (int shiftBy=0, i=offset; shiftBy < 64; shiftBy+=8, i++) {
        shiftedval=((long)(b[i] & 0xff)) << shiftBy;
        accum|=shiftedval;
      }
      return accum;
    }
}
