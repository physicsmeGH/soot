package soot.jimple.paddle.bdddomains;

import jedd.*;
import soot.jimple.paddle.*;
import soot.*;

public class VAR extends Domain {
    public Numberer numberer() { return new soot.util.JeddNumberer(PaddleNumberers.v().varNodeNumberer()); }
    
    public final int bits = 20;
    
    public static Domain v() { return instance; }
    
    private static Domain instance = new VAR();
    
    public VAR() { super(); }
}
