package all;

public class ClonePair13651 {

    byte[] method1(String str){
      char[] chars=str.toCharArray();
      int chars_length=chars.length - chars.length % 2;
      byte[] res=new byte[chars_length / 2];
      for (int i=0; i < chars_length; i+=2) {
        String b=new String(chars,i,2);
        res[i / 2]=(byte)Integer.parseInt(b,16);
      }
      return (res);
    }

    byte[] method2(String s){
      byte[] bb=new byte[s.length() / 2];
      int ii;
      for (int i=0; i < bb.length; i++) {
        ii=Integer.parseInt(s.substring(i * 2,i * 2 + 2),16);
        if (ii > 127) {
          ii=ii - 256;
        }
        bb[i]=(byte)ii;
      }
      return bb;
    }
}
