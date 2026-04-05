package unverified;

public class ClonePair3203 {

    String method1(byte[] bytes,String separator){
      StringBuilder sb=new StringBuilder();
      for (int i=0; i < bytes.length; i++) {
        String code=Integer.toHexString(bytes[i] & 0xFF);
        if ((bytes[i] & 0xFF) < 16) {
          sb.append('0');
        }
        sb.append(code);
        if (separator != null && i < bytes.length - 1) {
          sb.append(separator);
        }
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
