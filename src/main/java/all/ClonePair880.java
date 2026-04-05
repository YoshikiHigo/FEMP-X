package all;

public class ClonePair880 {

    double[] method1(double[] pwm,int num){
      double[] newpwm=new double[pwm.length + num * 4];
      int i=0;
      while (i < pwm.length) {
        newpwm[i]=pwm[i];
        i++;
      }
      while (i < newpwm.length) {
        newpwm[i]=0.25;
        i++;
      }
      return newpwm;
    }

    double[] method2(double[] seq,int num){
      double[] newseq=new double[seq.length + num * 4];
      int i=0;
      while (i < num) {
        newseq[i * 4]=0.25;
        newseq[i * 4 + 1]=0.25;
        newseq[i * 4 + 2]=0.25;
        newseq[i * 4 + 3]=0.25;
        i++;
      }
      i=i * 4;
      while (i < seq.length + num) {
        newseq[i]=seq[i - num * 4];
        i++;
      }
      return newseq;
    }
}
