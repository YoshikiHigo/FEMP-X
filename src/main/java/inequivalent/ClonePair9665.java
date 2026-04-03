package inequivalent;

public class ClonePair9665 {

    String method1(String in, String placement, String tutor, String phase, String match, String server) {
        int pos = in.indexOf(match);
        int endpos = 0;
        int endstr = 0;
        String temp = "";
        while (pos != -1) {
            pos += (match.length() + 1);
            endstr = in.indexOf(" ", pos);
            if (in.charAt(pos) == '\"') {
                pos++;
                endstr = in.indexOf("\"", pos);
            }
            temp += in.substring(endpos, pos);
            if ((in.substring(pos, endstr).indexOf(":") == -1) && (in.charAt(pos) != '#')) {
                temp += (server + "?file=");
            }
            endpos = pos;
            pos = in.indexOf(match, endpos);
        }
        temp += in.substring(endpos);
        return temp;
    }

    String method2(String in, String placement, String tutor, String phase, String match, String server) {
        int pos = in.indexOf(match);
        int endpos = 0;
        int endstr = 0;
        String temp = "";
        while (pos != -1) {
            pos += (match.length() + 1);
            endstr = in.indexOf(" ", pos);
            if (in.charAt(pos) == '\"') {
                pos++;
                endstr = in.indexOf("\"", pos);
            }
            temp += in.substring(endpos, pos);
            if ((in.substring(pos, endstr).indexOf(":") == -1) && (in.charAt(pos) != '#')) {
                if (in.startsWith("site.html", pos + 3)) {
                    temp += "ShowStatic?file=";
                    pos += 3;
                } else if (!in.startsWith("virtualconsult.html", pos + 3) && !in.startsWith("site.html", pos + 3)) {
                    temp += (server + "?phase=" + phase + "&file=");
                }
            }
            endpos = pos;
            pos = in.indexOf(match, endpos);
        }
        temp += in.substring(endpos);
        return temp;
    }
}
