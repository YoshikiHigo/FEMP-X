package all;

public class ClonePair8031 {

    String method1(byte[] array,int offset,int length){
      String result="";
      for (int i=offset; i < (offset + length); ++i) {
        byte b=array[i];
        String currentHexString=Integer.toHexString(b & 0xFF);
        if (currentHexString.length() == 1)     currentHexString="0" + currentHexString;
        result+=currentHexString;
      }
      return result;
    }

    String method2(byte[] buffer,int off,int len){
      StringBuilder sb=new StringBuilder();
      for (int i=0; i < len; i++) {
        int v=buffer[off + i];
        if (v < 0)     v=-1 * v;
        if (v < 16)     sb.append('0');
        sb.append(Integer.toHexString(v));
      }
      return sb.toString();
    }
}
