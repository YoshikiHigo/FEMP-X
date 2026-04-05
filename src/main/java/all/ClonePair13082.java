package all;

public class ClonePair13082 {

    String method1(short s){
      int n=s & 0x0000FFFF;
      String result=((n < 0x00001000) ? "0" : "") + ((n < 0x00000100) ? "0" : "") + ((n < 0x00000010) ? "0" : "")+ Integer.toHexString(s);
      if (result.length() > 4) {
        result=result.substring(result.length() - 4,result.length());
      }
      return result.toUpperCase();
    }

    String method2(short s){
      String temp=Integer.toHexString(s).toUpperCase();
      if (temp.length() == 1) {
        temp="000" + temp;
      }
     else   if (temp.length() == 2) {
        temp="00" + temp;
      }
     else   if (temp.length() == 3) {
        temp="0" + temp;
      }
     else   if (temp.length() == 4) {
      }
     else {
        temp=temp.substring(temp.length() - 4,temp.length());
      }
      return temp;
    }
}
