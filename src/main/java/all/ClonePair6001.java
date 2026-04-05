package all;

public class ClonePair6001 {

    byte[] method1(String theInputData,int theSize){
      byte[] myOutputArray=new byte[theSize];
      for (int cpt=0; cpt < theSize; cpt++) {
        if (theInputData.charAt(cpt) == 0x40)     myOutputArray[cpt]=(byte)(' ');
     else     if ((theInputData.charAt(cpt) >= 0xC1) && (theInputData.charAt(cpt) <= 0xC9))     myOutputArray[cpt]=(byte)(theInputData.charAt(cpt) - 0xC1 + 'A');
     else     if ((theInputData.charAt(cpt) >= 0xD1) && (theInputData.charAt(cpt) <= 0xD9))     myOutputArray[cpt]=(byte)(theInputData.charAt(cpt) - 0xD1 + 'J');
     else     if ((theInputData.charAt(cpt) >= 0xE2) && (theInputData.charAt(cpt) <= 0xE9))     myOutputArray[cpt]=(byte)(theInputData.charAt(cpt) - 0xE2 + 'S');
     else     if ((theInputData.charAt(cpt) >= 0xF0) && (theInputData.charAt(cpt) <= 0xF9))     myOutputArray[cpt]=(byte)(theInputData.charAt(cpt) - 0xF0 + '0');
      }
      return myOutputArray;
    }

    byte[] method2(String strHex,int iLen){
      byte[] tk;
      tk=new byte[iLen];
      int i, iTemp;
      int bTemp, bValue;
      int strLen;
      char c;
      strLen=strHex.length();
      if (strLen < 2 * iLen) {
        ;
      }
      for (i=0; i < iLen; i++) {
        bValue=(int)strHex.charAt(i * 2);
        if (('0' <= bValue) && (bValue <= '9')) {
          bTemp=(bValue - '0') * 16;
        }
     else     if (('a' <= bValue) && (bValue <= 'f')) {
          bTemp=(bValue - 'a' + 10) * 16;
        }
     else     if (('A' <= bValue) && (bValue <= 'F')) {
          bTemp=(bValue - 'A' + 10) * 16;
        }
     else {
          bTemp=0;
          ;
        }
        bValue=(int)strHex.charAt(i * 2 + 1);
        if (('0' <= bValue) && (bValue <= '9')) {
          bTemp+=(bValue - '0');
        }
     else     if (('a' <= bValue) && (bValue <= 'f')) {
          bTemp+=(bValue - 'a' + 10);
        }
     else     if (('A' <= bValue) && (bValue <= 'F')) {
          bTemp+=((bValue - 'A' + 10));
        }
     else {
          ;
        }
        if (bTemp > 128) {
          bTemp=bTemp - 256;
        }
        tk[i]=(byte)bTemp;
      }
      return tk;
    }
}
