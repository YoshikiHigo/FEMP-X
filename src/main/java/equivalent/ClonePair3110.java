package equivalent;

import java.util.Vector;

public class ClonePair3110 {
    String[] method1(String in, String sp) {
        Vector vecTmp = new Vector();
        String strTmp = "";
        String[] out = null;
        int pointer = 0, p2 = 0;
        if (in.indexOf(sp) < 0) {
            out = new String[1];
            out[0] = in;
            return out;
        }
        if (!in.endsWith(sp)) in = in + sp;
        while ((p2 = in.indexOf(sp, pointer)) >= 0) {
            vecTmp.addElement(in.substring(pointer, p2));
            pointer = p2 + sp.length();
            if (pointer >= in.length()) break;
        }
        int vl = vecTmp.size();
        out = new String[vl];
        for (int i = 0; i < vl; i++) {
            strTmp = (String) vecTmp.elementAt(i);
            out[i] = strTmp;
        }
        return out;
    }

    String[] method2(String text, String run) {
        int n = 1;
        int i = text.indexOf(run);
        String[] lines;
        int runLen = run.length();
        if (i < 0 || runLen == 0) {
            lines = new String[1];
            lines[0] = text;
            return lines;
        }
        int len = text.length() - runLen;
        for (; i >= 0 && i < len; n++) i = text.indexOf(run, i + runLen);
        lines = new String[n];
        i = 0;
        int ipt = 0;
        int pt = 0;
        while ((ipt = text.indexOf(run, i)) >= 0 && pt + 1 < n) {
            lines[pt++] = text.substring(i, ipt);
            i = ipt + runLen;
        }
        if (text.indexOf(run, len) != len) len += runLen;
        lines[pt] = text.substring(i, len);
        return lines;
    }
}
