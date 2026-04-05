package unverified;

public class ClonePair13313 {

    byte[] method1(String no){
      byte[] number=new byte[no.length() / 2];
      int i;
      for (i=0; i < no.length(); i+=2) {
        int j=Integer.parseInt(no.substring(i,i + 2),16);
        number[i / 2]=(byte)(j & 0x000000ff);
      }
      return number;
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
