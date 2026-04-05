package all;

public class ClonePair6965 {

    int method1(int a,int b,int c){
      int p=a + b - c;
      int pa=Math.abs(p - a);
      int pb=Math.abs(p - b);
      int pc=Math.abs(p - c);
      if ((pa <= pb) && (pa <= pc)) {
        return a;
      }
     else   if (pb <= pc) {
        return b;
      }
     else {
        return c;
      }
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
