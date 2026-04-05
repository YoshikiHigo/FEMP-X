package all;

public class ClonePair1237 {

    String method1(byte[] from){
      StringBuffer buffer=new StringBuffer((from.length + 1) / 2);
      char previous=0;
      for (int i=0; i < from.length; i++) {
        char byteValue=(char)(0xff & from[i]);
        if (i % 2 != 0) {
          buffer.append((char)(previous + byteValue));
        }
     else {
          previous=(char)(byteValue << 8);
        }
      }
      if (from.length % 2 != 0) {
        buffer.append(previous);
      }
      return buffer.toString();
    }

    String method2(byte[] from){
      final StringBuffer buffer=new StringBuffer((from.length + 1) / 2);
      final char hibyte=0;
      for (int i=0; i < from.length / 2 * 2; i+=2) {
        buffer.append((char)((0xff00 & (from[i] << 8)) + (0xff & from[i + 1])));
      }
      if (from.length % 2 != 0) {
        buffer.append((char)(0xff & from[from.length - 1]));
      }
      return buffer.toString();
    }
}
