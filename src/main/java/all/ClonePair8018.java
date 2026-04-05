package all;

public class ClonePair8018 {

    String method1(byte[] byteArray,int offset,int maxLength){
      int length=0;
      while ((0 != byteArray[offset + length]) && (length < maxLength))   length++;
      return new String(byteArray,offset,length);
    }

    String method2(byte[] data,int offset,int maxlen){
      int start=offset;
      while (data[offset] != 0 && offset < data.length && (offset - start) < maxlen)   offset++;
      byte[] tmp=new byte[offset - start];
      System.arraycopy(data,start,tmp,0,offset - start);
      return new String(tmp);
    }
}
