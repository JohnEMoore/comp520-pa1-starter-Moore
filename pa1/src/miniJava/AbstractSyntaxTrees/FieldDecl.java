/**
 * miniJava Abstract Syntax Tree classes
 * @author prins
 * @version COMP 520 (v2.2)
 */
package miniJava.AbstractSyntaxTrees;

import miniJava.CodeGeneration.x64.Reg64;
import miniJava.SyntacticAnalyzer.SourcePosition;

public class FieldDecl extends MemberDecl {

	public Reg64 entityRef = Reg64.R15;
	public int entityOffset;
	
	public FieldDecl(boolean isPrivate, boolean isStatic, TypeDenoter t, String name, SourcePosition posn){
    super(isPrivate, isStatic, t, name, posn);

	}
	
	public FieldDecl(MemberDecl md, SourcePosition posn) {
		super(md,posn);
	}
	
	public <A, R> R visit(Visitor<A, R> v, A o) {
        return v.visitFieldDecl(this, o);
    }
}

