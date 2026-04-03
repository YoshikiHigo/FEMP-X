package equivalent;

import java.util.Vector;

public class ClonePair7885 {
    Vector method1(String argStr) {
        Vector result = new Vector();
        StringBuffer argBuf = new StringBuffer();
        boolean backSlash = false;
        boolean matchSglQuote = false;
        boolean matchDblQuote = false;
        for (int cIdx = 0; cIdx < argStr.length(); ++cIdx) {
            char ch = argStr.charAt(cIdx);
            switch (ch) {
                case ' ':
                case '\t':
                case '\n':
                case '\r':
                    if (backSlash) {
                        argBuf.append(ch);
                        backSlash = false;
                    } else if (matchSglQuote || matchDblQuote) {
                        argBuf.append(ch);
                    } else if (argBuf.length() > 0) {
                        result.addElement(argBuf.toString());
                        argBuf.setLength(0);
                    }
                    break;
                case '\\':
                    if (backSlash) {
                        argBuf.append("\\");
                    }
                    backSlash = !backSlash;
                    break;
                case '\'':
                    if (backSlash) {
                        argBuf.append("'");
                        backSlash = false;
                    } else if (matchSglQuote) {
                        result.addElement(argBuf.toString());
                        argBuf.setLength(0);
                        matchSglQuote = false;
                    } else if (!matchDblQuote) {
                        matchSglQuote = true;
                    }
                    break;
                case '"':
                    if (backSlash) {
                        argBuf.append("\"");
                        backSlash = false;
                    } else if (matchDblQuote) {
                        result.addElement(argBuf.toString());
                        argBuf.setLength(0);
                        matchDblQuote = false;
                    } else if (!matchSglQuote) {
                        matchDblQuote = true;
                    }
                    break;
                default:
                    if (backSlash) {
                        switch (ch) {
                            case 'b':
                                argBuf.append('\b');
                                break;
                            case 'f':
                                argBuf.append('\f');
                                break;
                            case 'n':
                                argBuf.append('\n');
                                break;
                            case 'r':
                                argBuf.append('\r');
                                break;
                            case 't':
                                argBuf.append('\t');
                                break;
                            default:
                                char ch2 = argStr.charAt(cIdx + 1);
                                char ch3 = argStr.charAt(cIdx + 2);
                                if (((ch >= '0') && (ch <= '7')) && ((ch2 >= '0') && (ch2 <= '7')) && ((ch3 >= '0') && (ch3 <= '7'))) {
                                    int octal = (((ch - '0') * 64) + ((ch2 - '0') * 8) + (ch3 - '0'));
                                    argBuf.append((char) octal);
                                    cIdx += 2;
                                } else if (ch == '0') {
                                    argBuf.append('\0');
                                } else {
                                    argBuf.append(ch);
                                }
                                break;
                        }
                    } else {
                        argBuf.append(ch);
                    }
                    backSlash = false;
                    break;
            }
        }
        if (argBuf.length() > 0) {
            result.addElement(argBuf.toString());
        }
        return result;
    }

    Vector method2(String argStr) {
        Vector result = new Vector();
        StringBuffer argBuf = new StringBuffer();
        boolean backSlash = false;
        boolean matchSglQuote = false;
        boolean matchDblQuote = false;
        for (int cIdx = 0; cIdx < argStr.length(); ++cIdx) {
            char ch = argStr.charAt(cIdx);
            switch (ch) {
                case ' ':
                case '\t':
                case '\n':
                case '\r':
                    if (backSlash) {
                        argBuf.append(ch);
                        backSlash = false;
                    } else if (matchSglQuote || matchDblQuote) {
                        argBuf.append(ch);
                    } else if (argBuf.length() > 0) {
                        result.addElement(argBuf.toString());
                        argBuf.setLength(0);
                    }
                    break;
                case '\\':
                    if (backSlash) {
                        argBuf.append("\\");
                    }
                    backSlash = !backSlash;
                    break;
                case '\'':
                    if (backSlash) {
                        argBuf.append("'");
                        backSlash = false;
                    } else if (matchSglQuote) {
                        result.addElement(argBuf.toString());
                        argBuf.setLength(0);
                        matchSglQuote = false;
                    } else if (!matchDblQuote) {
                        matchSglQuote = true;
                    }
                    break;
                case '"':
                    if (backSlash) {
                        argBuf.append("\"");
                        backSlash = false;
                    } else if (matchDblQuote) {
                        result.addElement(argBuf.toString());
                        argBuf.setLength(0);
                        matchDblQuote = false;
                    } else if (!matchSglQuote) {
                        matchDblQuote = true;
                    }
                    break;
                default:
                    if (backSlash) {
                        switch (ch) {
                            case 'b':
                                argBuf.append('\b');
                                break;
                            case 'f':
                                argBuf.append('\f');
                                break;
                            case 'n':
                                argBuf.append('\n');
                                break;
                            case 'r':
                                argBuf.append('\r');
                                break;
                            case 't':
                                argBuf.append('\t');
                                break;
                            default:
                                char ch2 = argStr.charAt(cIdx + 1);
                                char ch3 = argStr.charAt(cIdx + 2);
                                if ((ch >= '0' && ch <= '7') && (ch2 >= '0' && ch2 <= '7') && (ch3 >= '0' && ch3 <= '7')) {
                                    int octal = (((ch - '0') * 64) + ((ch2 - '0') * 8) + (ch3 - '0'));
                                    argBuf.append((char) octal);
                                    cIdx += 2;
                                } else if (ch == '0') {
                                    argBuf.append('\0');
                                } else {
                                    argBuf.append(ch);
                                }
                                break;
                        }
                    } else {
                        argBuf.append(ch);
                    }
                    backSlash = false;
                    break;
            }
        }
        if (argBuf.length() > 0) {
            result.addElement(argBuf.toString());
        }
        return result;
    }
}
