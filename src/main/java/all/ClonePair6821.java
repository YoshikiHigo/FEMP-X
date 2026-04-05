package all;

public class ClonePair6821 {

    int method1(int left,int above,int upperLeft){
      int p=(left + above) - upperLeft;
      int pa=Math.abs(p - left);
      int pb=Math.abs(p - above);
      int pc=Math.abs(p - upperLeft);
      if ((pa <= pb) && (pa <= pc)) {
        return left;
      }
      if (pb <= pc) {
        return above;
      }
      return upperLeft;
    }

    int method2(int a,int b,int c){
      int p=a + b - c;
      int pa=Math.abs(p - a);
      int pb=Math.abs(p - b);
      int pc=Math.abs(p - c);
      if (pa <= pb && pa <= pc) {
        return a;
      }
     else   if (pb <= pc) {
        return b;
      }
     else {
        return c;
      }
    }
}
