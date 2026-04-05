package all;

public class ClonePair13382 {

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
      final byte[] ip=new byte[4];
      int dotCount=0;
      for (int pos=0; pos < addr.length(); ) {
        if ((pos != 0) && (addr.charAt(pos) == '.')) {
          dotCount++;
          if (dotCount > 3)       return null;
          pos++;
        }
        int start=pos;
        while ((pos < addr.length()) && Character.isDigit(addr.charAt(pos)))     pos++;
        if (pos != start) {
          try {
            final int i=Integer.parseInt(addr.substring(start,pos));
            if ((i < 0) || (255 < i))         return null;
            ip[dotCount]=(byte)i;
          }
     catch (      NumberFormatException e) {
            return null;
          }
        }
     else     return null;
      }
      if (dotCount != 3)   return null;
      return ip;
    }
}
