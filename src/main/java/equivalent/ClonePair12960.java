package equivalent;

public class ClonePair12960 {
    int method1(long x) {
        int n = 1;
        int y = (int) x;
        if (y == 0) {
            n += 32;
            y = (int) (x >>> 32);
        }
        if ((y & 0x0000FFFF) == 0) {
            n += 16;
            y >>>= 16;
        }
        if ((y & 0x000000FF) == 0) {
            n += 8;
            y >>>= 8;
        }
        if ((y & 0x0000000F) == 0) {
            n += 4;
            y >>>= 4;
        }
        if ((y & 0x00000003) == 0) {
            n += 2;
            y >>>= 2;
        }
        return n - (y & 1);
    }

    int method2(long bits) {
        if ((bits & 0xFFFFFFFFL) != 0L) {
            if ((bits & 0xFFFFL) != 0L) {
                if ((bits & 0xFFL) != 0L) {
                    if ((bits & 0xFL) != 0L) {
                        if ((bits & 0x3L) != 0L) {
                            if ((bits & 0x1L) == 0x1L) return 0;
                            else return 1;
                        } else {
                            if ((bits & 0x4L) == 0x4L) return 2;
                            else return 3;
                        }
                    } else {
                        if ((bits & 0x30L) != 0L) {
                            if ((bits & 0x10L) == 0x10L) return 4;
                            else return 5;
                        } else {
                            if ((bits & 0x40L) == 0x40L) return 6;
                            else return 7;
                        }
                    }
                } else {
                    if ((bits & 0xF00L) != 0L) {
                        if ((bits & 0x300L) != 0L) {
                            if ((bits & 0x100L) == 0x100L) return 8;
                            else return 9;
                        } else {
                            if ((bits & 0x400L) == 0x400L) return 10;
                            else return 11;
                        }
                    } else {
                        if ((bits & 0x3000L) != 0L) {
                            if ((bits & 0x1000L) == 0x1000L) return 12;
                            else return 13;
                        } else {
                            if ((bits & 0x4000L) == 0x4000L) return 14;
                            else return 15;
                        }
                    }
                }
            } else {
                if ((bits & 0xFF0000L) != 0L) {
                    if ((bits & 0xF0000L) != 0L) {
                        if ((bits & 0x30000L) != 0L) {
                            if ((bits & 0x10000L) == 0x10000L) return 16;
                            else return 17;
                        } else {
                            if ((bits & 0x40000L) == 0x40000L) return 18;
                            else return 19;
                        }
                    } else {
                        if ((bits & 0x300000L) != 0L) {
                            if ((bits & 0x100000L) == 0x100000L) return 20;
                            else return 21;
                        } else {
                            if ((bits & 0x400000L) == 0x400000L) return 22;
                            else return 23;
                        }
                    }
                } else {
                    if ((bits & 0xF000000L) != 0L) {
                        if ((bits & 0x3000000L) != 0L) {
                            if ((bits & 0x1000000L) == 0x1000000L) return 24;
                            else return 25;
                        } else {
                            if ((bits & 0x4000000L) == 0x4000000L) return 26;
                            else return 27;
                        }
                    } else {
                        if ((bits & 0x30000000L) != 0L) {
                            if ((bits & 0x10000000L) == 0x10000000L) return 28;
                            else return 29;
                        } else {
                            if ((bits & 0x40000000L) == 0x40000000L) return 30;
                            else return 31;
                        }
                    }
                }
            }
        } else {
            if ((bits & 0xFFFF00000000L) != 0L) {
                if ((bits & 0xFF00000000L) != 0L) {
                    if ((bits & 0xF00000000L) != 0L) {
                        if ((bits & 0x300000000L) != 0L) {
                            if ((bits & 0x100000000L) == 0x100000000L) return 32;
                            else return 33;
                        } else {
                            if ((bits & 0x4000000000L) == 0x4000000000L) return 34;
                            else return 35;
                        }
                    } else {
                        if ((bits & 0x3000000000L) != 0L) {
                            if ((bits & 0x1000000000L) == 0x1000000000L) return 36;
                            else return 37;
                        } else {
                            if ((bits & 0x4000000000L) == 0x4000000000L) return 38;
                            else return 39;
                        }
                    }
                } else {
                    if ((bits & 0xF0000000000L) != 0L) {
                        if ((bits & 0x30000000000L) != 0L) {
                            if ((bits & 0x10000000000L) == 0x10000000000L) return 40;
                            else return 41;
                        } else {
                            if ((bits & 0x40000000000L) == 0x40000000000L) return 42;
                            else return 43;
                        }
                    } else {
                        if ((bits & 0x300000000000L) != 0L) {
                            if ((bits & 0x100000000000L) == 0x100000000000L) return 44;
                            else return 45;
                        } else {
                            if ((bits & 0x400000000000L) == 0x400000000000L) return 46;
                            else return 47;
                        }
                    }
                }
            } else {
                if ((bits & 0xFF000000000000L) != 0L) {
                    if ((bits & 0xF000000000000L) != 0L) {
                        if ((bits & 0x3000000000000L) != 0L) {
                            if ((bits & 0x1000000000000L) == 0x1000000000000L) return 48;
                            else return 49;
                        } else {
                            if ((bits & 0x4000000000000L) == 0x4000000000000L) return 50;
                            else return 51;
                        }
                    } else {
                        if ((bits & 0x30000000000000L) != 0L) {
                            if ((bits & 0x10000000000000L) == 0x10000000000000L) return 52;
                            else return 53;
                        } else {
                            if ((bits & 0x40000000000000L) == 0x40000000000000L) return 54;
                            else return 55;
                        }
                    }
                } else {
                    if ((bits & 0xF00000000000000L) != 0L) {
                        if ((bits & 0x300000000000000L) != 0L) {
                            if ((bits & 0x100000000000000L) == 0x100000000000000L) return 56;
                            else return 57;
                        } else {
                            if ((bits & 0x400000000000000L) == 0x400000000000000L) return 58;
                            else return 59;
                        }
                    } else {
                        if ((bits & 0x3000000000000000L) != 0L) {
                            if ((bits & 0x1000000000000000L) == 0x1000000000000000L) return 60;
                            else return 61;
                        } else {
                            if ((bits & 0x4000000000000000L) == 0x4000000000000000L) return 62;
                            else return 63;
                        }
                    }
                }
            }
        }
    }
}
