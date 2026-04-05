package all;

public class ClonePair844 {

    boolean[] method1(String value,String modifier){
      boolean[] value256=new boolean[256];
      int from=0, to=0;
      value=value.substring(1,value.length() - 1);
      for (int i=0; i < value.length(); i++) {
        int hex;
        if (value.charAt(i) == '\\') {
    switch (value.charAt(i + 1)) {
    case 'x':case 'X':        hex=Integer.parseInt(value.substring(i + 2,i + 4),16);
          value256[hex]=true;
        i=i + 3;
      break;
    case 'd':for (int j=48; j <= 57; j++) {
      value256[j]=true;
    }
    i++;
    break;
    case 'w':i++;
    break;
    case 's':value256[32]=true;
    i++;
    break;
    case 'n':value256[10]=true;
    i++;
    break;
    case 'r':value256[14]=true;
    i++;
    break;
    case 't':value256[9]=true;
    i++;
    break;
    case 'z':from=(int)Integer.valueOf(value.substring(i + 2,i + 4),16);
    to=(int)Integer.valueOf(value.substring(i + 4,i + 6),16);
    if (modifier.contains("i")) {
    int from1=0, to1=0;
    if (from >= 65 && from <= 90) {
    from1=from + 32;
    }
     else if (from >= 97 && from <= 122) {
    from1=from - 32;
    }
    if (to >= 65 && to <= 90) {
    to1=to + 32;
    }
     else if (from >= 97 && from <= 122) {
    to1=to - 32;
    }
    if ((from >= 65 && from <= 90 && to >= 65 && to <= 90) || (from >= 97 && from <= 122 && to >= 97 && to <= 122)) {
    for (int j=from; j <= to; j++) {
    value256[j]=true;
    }
    for (int j=from1; j <= to1; j++) {
    value256[j]=true;
    }
    }
     else {
    for (int j=from; j <= to; j++) {
    value256[j]=true;
    }
    }
    }
     else {
    for (int j=from; j <= to; j++) {
    value256[j]=true;
    }
    }
    i=i + 3;
    break;
    default:hex=(int)value.charAt(i + 1);
    value256[hex]=true;
    i++;
    break;
    }
    }
     else {
    value256[(int)value.charAt(i)]=true;
    }
    }
    return value256;
    }

    boolean[] method2(String value,String modifier){
      boolean[] value256=new boolean[256];
      for (int i=0; i < 256; i++) {
        value256[i]=true;
      }
      int from=0, to=0;
      value=value.substring(2,value.length() - 1);
      for (int i=0; i < value.length(); i++) {
        int hex;
        if (value.charAt(i) == '\\') {
    switch (value.charAt(i + 1)) {
    case 'x':case 'X':        hex=Integer.parseInt(value.substring(i + 2,i + 4),16);
          value256[hex]=false;
        i=i + 3;
      break;
    case 'd':for (int j=48; j <= 57; j++) {
      value256[j]=false;
    }
    i++;
    break;
    case 'w':i++;
    break;
    case 's':value256[32]=false;
    i++;
    break;
    case 'n':value256[10]=false;
    i++;
    break;
    case 'r':value256[14]=false;
    i++;
    break;
    case 't':value256[9]=false;
    i++;
    break;
    case 'z':from=(int)Integer.valueOf(value.substring(i + 2,i + 4),16);
    to=(int)Integer.valueOf(value.substring(i + 4,i + 6),16);
    if (modifier.contains("i")) {
    int from1=0, to1=0;
    if (from >= 65 && from <= 90) {
    from1=from + 32;
    }
     else if (from >= 97 && from <= 122) {
    from1=from - 32;
    }
    if (to >= 65 && to <= 90) {
    to1=to + 32;
    }
     else if (from >= 97 && from <= 122) {
    to1=to - 32;
    }
    if ((from >= 65 && from <= 90 && to >= 65 && to <= 90) || (from >= 97 && from <= 122 && to >= 97 && to <= 122)) {
    for (int j=from; j <= to; j++) {
    value256[j]=false;
    }
    for (int j=from1; j <= to1; j++) {
    value256[j]=false;
    }
    }
     else {
    for (int j=from; j <= to; j++) {
    value256[j]=false;
    }
    }
    }
     else {
    for (int j=from; j <= to; j++) {
    value256[j]=false;
    }
    }
    i=i + 3;
    break;
    default:value256[(int)value.charAt(i + 1)]=false;
    i++;
    break;
    }
    }
     else {
    value256[(int)value.charAt(i)]=false;
    }
    }
    return value256;
    }
}
