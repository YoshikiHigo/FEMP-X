package all;

public class ClonePair849 {

    StringBuffer method1(byte[] header,int offset,int length){
      StringBuffer result=new StringBuffer(length);
      int end=offset + length;
      for (int i=offset; i < end; ++i) {
        if (header[i] == 0) {
          break;
        }
        result.append((char)header[i]);
      }
      return result;
    }

    StringBuffer method2(byte[] header,int offset,int length){
      StringBuffer result=new StringBuffer(length);
      int end=offset + length;
      for (int i=offset; i < end; ++i) {
        if (header[i] == 0)     break;
        result.append((char)header[i]);
      }
      return result;
    }
}
