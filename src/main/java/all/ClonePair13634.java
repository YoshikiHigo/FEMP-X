package all;

public class ClonePair13634 {

    byte[] method1(String device){
      int len=device.length() / 2;
      byte[] data=new byte[len];
      for (int i=len - 1; i >= 0; i--) {
        data[i]=(byte)Integer.parseInt(device.substring(i * 2,i * 2 + 2),16);
      }
      return data;
    }

    byte[] method2(String str){
      char[] chars=str.toCharArray();
      int chars_length=chars.length - chars.length % 2;
      byte[] res=new byte[chars_length / 2];
      for (int i=0; i < chars_length; i+=2) {
        String b=new String(chars,i,2);
        res[i / 2]=(byte)Integer.parseInt(b,16);
      }
      return (res);
    }
}
