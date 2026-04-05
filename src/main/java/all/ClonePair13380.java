package all;

public class ClonePair13380 {

    byte[] method1(String address){
      byte[] addressBytes=null;
      int dotIndex=address.indexOf('.');
      try {
        if (dotIndex > 0) {
          addressBytes=new byte[4];
          int previousIndex=-1;
          for (int i=0; i < 4; i++) {
            String ipPart=address.substring(previousIndex + 1,dotIndex);
            int ipPartInt=Integer.parseInt(ipPart);
            addressBytes[i]=(byte)ipPartInt;
            previousIndex=dotIndex;
            dotIndex=address.indexOf('.',dotIndex + 1);
            if (dotIndex == -1)         dotIndex=address.length();
          }
        }
      }
     catch (  Exception e) {
        return null;
      }
      return addressBytes;
    }

    byte[] method2(String addr){
      String parts[]=addr.split("\\.",-1);
      if (parts.length != 4) {
        return null;
      }
      byte b[]=new byte[4];
      for (int i=0; i < 4; i++) {
        try {
          int v=Integer.parseInt(parts[i]);
          if (v >= 0 && v <= 255) {
            b[i]=(byte)v;
          }
     else {
            return null;
          }
        }
     catch (    NumberFormatException e) {
          return null;
        }
      }
      return b;
    }
}
