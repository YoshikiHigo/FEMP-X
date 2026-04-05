package all;

public class ClonePair920 {

    String method1(byte[] data,int offset){
      StringBuffer buffer=new StringBuffer();
      char c;
      for (int loop=0; offset + loop < data.length; loop++) {
        c=(char)data[offset + loop];
        if (c == 0) {
          break;
        }
        buffer.append(c);
      }
      return (buffer.toString());
    }

    String method2(byte[] buffer,int offset){
      StringBuffer result=new StringBuffer();
      while (offset < buffer.length) {
        char c=(char)buffer[offset++];
        if (c == 0)     break;
        result.append(c);
      }
      return result.toString();
    }
}
