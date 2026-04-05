package all;

public class ClonePair7107 {

    String method1(byte b){
      int i=b & 0xFF;
      byte j=(byte)(i / 0x10);
      String s;
      if (j == 0x0) {
        s="0";
      }
     else   if (j == 0x1) {
        s="1";
      }
     else   if (j == 0x2) {
        s="2";
      }
     else   if (j == 0x3) {
        s="3";
      }
     else   if (j == 0x4) {
        s="4";
      }
     else   if (j == 0x5) {
        s="5";
      }
     else   if (j == 0x6) {
        s="6";
      }
     else   if (j == 0x7) {
        s="7";
      }
     else   if (j == 0x8) {
        s="8";
      }
     else   if (j == 0x9) {
        s="9";
      }
     else   if (j == 0xA) {
        s="A";
      }
     else   if (j == 0xB) {
        s="B";
      }
     else   if (j == 0xC) {
        s="C";
      }
     else   if (j == 0xD) {
        s="D";
      }
     else   if (j == 0xE) {
        s="E";
      }
     else {
        s="F";
      }
      j=(byte)(i % 0x10);
      String t;
      if (j == 0x0) {
        t="0";
      }
     else   if (j == 0x1) {
        t="1";
      }
     else   if (j == 0x2) {
        t="2";
      }
     else   if (j == 0x3) {
        t="3";
      }
     else   if (j == 0x4) {
        t="4";
      }
     else   if (j == 0x5) {
        t="5";
      }
     else   if (j == 0x6) {
        t="6";
      }
     else   if (j == 0x7) {
        t="7";
      }
     else   if (j == 0x8) {
        t="8";
      }
     else   if (j == 0x9) {
        t="9";
      }
     else   if (j == 0xA) {
        t="A";
      }
     else   if (j == 0xB) {
        t="B";
      }
     else   if (j == 0xC) {
        t="C";
      }
     else   if (j == 0xD) {
        t="D";
      }
     else   if (j == 0xE) {
        t="E";
      }
     else {
        t="F";
      }
      return s + t;
    }

    String method2(byte b){
      int i=b & 0xFF;
      byte j=(byte)(i / 0x10);
      String s;
      if (j == 0x0)   s="0";
     else   if (j == 0x1)   s="1";
     else   if (j == 0x2)   s="2";
     else   if (j == 0x3)   s="3";
     else   if (j == 0x4)   s="4";
     else   if (j == 0x5)   s="5";
     else   if (j == 0x6)   s="6";
     else   if (j == 0x7)   s="7";
     else   if (j == 0x8)   s="8";
     else   if (j == 0x9)   s="9";
     else   if (j == 0xA)   s="A";
     else   if (j == 0xB)   s="B";
     else   if (j == 0xC)   s="C";
     else   if (j == 0xD)   s="D";
     else   if (j == 0xE)   s="E";
     else   s="F";
      j=(byte)(i % 0x10);
      String t;
      if (j == 0x0)   t="0";
     else   if (j == 0x1)   t="1";
     else   if (j == 0x2)   t="2";
     else   if (j == 0x3)   t="3";
     else   if (j == 0x4)   t="4";
     else   if (j == 0x5)   t="5";
     else   if (j == 0x6)   t="6";
     else   if (j == 0x7)   t="7";
     else   if (j == 0x8)   t="8";
     else   if (j == 0x9)   t="9";
     else   if (j == 0xA)   t="A";
     else   if (j == 0xB)   t="B";
     else   if (j == 0xC)   t="C";
     else   if (j == 0xD)   t="D";
     else   if (j == 0xE)   t="E";
     else   t="F";
      return s + t;
    }
}
