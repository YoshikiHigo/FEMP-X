package all;

public class ClonePair3202 {

    String method1(byte[] data,String sep){
      final StringBuffer sb=new StringBuffer();
      for (int i=0; i < data.length; ++i) {
        final int no=data[i] & 0xff;
        if (no < 0x10)     sb.append('0');
        sb.append(Integer.toHexString(no));
        if (sep != null && i < data.length - 1)     sb.append(sep);
      }
      return sb.toString();
    }

    String method2(byte[] bytes,String separator){
      StringBuffer result=new StringBuffer();
      for (int i=0; i < bytes.length; i++) {
        int unsignedByte=bytes[i] & 0xff;
        if (unsignedByte < 16) {
          result.append("0");
        }
        result.append(Integer.toHexString(unsignedByte));
        if (separator != null && i + 1 < bytes.length) {
          result.append(separator);
        }
      }
      return result.toString();
    }
}
