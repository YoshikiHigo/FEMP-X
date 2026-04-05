package unverified;

public class ClonePair13531 {

    byte[] method1(String addr){
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
