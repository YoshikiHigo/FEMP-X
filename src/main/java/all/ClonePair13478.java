package all;

public class ClonePair13478 {

    byte[] method1(String iStr){
      byte[] outArr=new byte[iStr.length() / 2];
      for (int i=0; i < iStr.length(); i+=2) {
        String hex=iStr.substring(i,i + 2);
        byte b=(byte)((int)Integer.parseInt(hex,16) & 0xFF);
        outArr[i / 2]=b;
      }
      return outArr;
    }

    byte[] method2(String hexString){
      char c[]=hexString.toCharArray();
      int cnt=0;
      for (int i=0; i < c.length; i++)   if (c[i] == '-')   cnt++;
      byte val[]=new byte[(hexString.length() - cnt) / 2];
      int i=0;
      while (hexString.length() > 0) {
        boolean minus=hexString.charAt(0) == '-';
        if (minus)     hexString=hexString.substring(1);
        String hex_val=hexString.substring(0,2);
        int int_val=Integer.decode("0x" + hex_val).intValue();
        if (int_val > 127 || minus)     int_val=-(int_val ^ 0x80);
        val[i]=(byte)int_val;
        hexString=hexString.substring(2);
        i++;
      }
      return val;
    }
}
