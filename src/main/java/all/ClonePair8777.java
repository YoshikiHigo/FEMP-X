package all;

public class ClonePair8777 {

    double[][] method1(String[] hits){
      int lenOfAHit=hits[0].length();
      int len=hits.length;
      double[][] PSPM=new double[lenOfAHit][4];
      for (int i=0; i < lenOfAHit; i++) {
        double As=0;
        double Cs=0;
        double Gs=0;
        double Ts=0;
        for (int j=0; j < len; j++) {
          char test=hits[j].charAt(i);
    switch (test) {
    case 'A':        As++;
          break;
    case 'C':    Cs++;
      break;
    case 'G':Gs++;
    break;
    case 'T':Ts++;
    break;
    default:System.out.println("\n\nFatal error: odd base in makeAddOnePSPM hits -> " + test + "\n\n");
    System.exit(0);
    }
    }
    if (As == 0 || Cs == 0 || Gs == 0 || Ts == 0) {
    As++;
    Cs++;
    Gs++;
    Ts++;
    }
    double total=As + Cs + Gs+ Ts;
    double[] Ps={As / total,Cs / total,Gs / total,Ts / total};
    PSPM[i]=Ps;
    }
    return PSPM;
    }

    double[][] method2(String[] hits){
      int lenOfAHit=hits[0].length();
      int len=hits.length;
      double[][] PSPM=new double[lenOfAHit][4];
      for (int i=0; i < lenOfAHit; i++) {
        double As=0;
        double Cs=0;
        double Gs=0;
        double Ts=0;
        for (int j=0; j < len; j++) {
          char test=hits[j].charAt(i);
    switch (test) {
    case 'A':        As++;
          break;
    case 'C':    Cs++;
      break;
    case 'G':Gs++;
    break;
    case 'T':Ts++;
    break;
    default:System.out.println("\n\nFatal error: odd base in makeAddOnePSPM hits -> " + test + "\n\n");
    System.exit(0);
    }
    }
    double total=As + Cs + Gs+ Ts;
    double[] Ps={As / total,Cs / total,Gs / total,Ts / total};
    PSPM[i]=Ps;
    }
    return PSPM;
    }
}
