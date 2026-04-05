package all;

public class ClonePair4240 {

    String method1(String table,char pad,byte[] buffer){
      int limit=buffer.length - (buffer.length % 3);
      StringBuffer out=new StringBuffer();
      int[] buff=new int[buffer.length];
      for (int i=0; i < buffer.length; i++)   buff[i]=buffer[i] & 0xff;
      for (int i=0; i < limit; i+=3) {
        out.append(table.charAt(buff[i] >> 2));
        out.append(table.charAt(((buff[i] << 4) & 0x30) | (buff[i + 1] >> 4)));
        out.append(table.charAt(((buff[i + 1] << 2) & 0x3c) | (buff[i + 2] >> 6)));
        out.append(table.charAt(buff[i + 2] & 0x3f));
      }
      int i=limit;
    switch (buff.length - i) {
    case 1:    out.append(table.charAt(buff[i] >> 2));
      out.append(table.charAt(((buff[i] << 4) & 0x30)));
    out.append(pad).append(pad);
    break;
    case 2:out.append(table.charAt(buff[i] >> 2));
    out.append(table.charAt(((buff[i] << 4) & 0x30) | (buff[i + 1] >> 4)));
    out.append(table.charAt(((buff[i + 1] << 2) & 0x3c)));
    out.append(pad);
    break;
    }
    return out.toString();
    }

    String method2(String table,char pad,byte[] buffer){
      int limit=buffer.length - (buffer.length % 3);
      StringBuffer out=new StringBuffer();
      int[] buff=new int[buffer.length];
      for (int i=0; i < buffer.length; i++)   buff[i]=(int)buffer[i] & 0xff;
      for (int i=0; i < limit; i+=3) {
        out.append(table.charAt(buff[i] >> 2));
        out.append(table.charAt(((buff[i] << 4) & 0x30) | (buff[i + 1] >> 4)));
        out.append(table.charAt(((buff[i + 1] << 2) & 0x3c) | (buff[i + 2] >> 6)));
        out.append(table.charAt(buff[i + 2] & 0x3f));
      }
      int i=limit;
    switch (buff.length - i) {
    case 1:    out.append(table.charAt(buff[i] >> 2));
      out.append(table.charAt(((buff[i] << 4) & 0x30)));
    out.append(pad).append(pad);
    break;
    case 2:out.append(table.charAt(buff[i] >> 2));
    out.append(table.charAt(((buff[i] << 4) & 0x30) | (buff[i + 1] >> 4)));
    out.append(table.charAt(((buff[i + 1] << 2) & 0x3c)));
    out.append(pad);
    break;
    }
    return out.toString();
    }
}
