// class for adding if expression 
class If extends Exp {

	// used for if, then, else
	Exp exp1;
	Exp exp2;
	Exp exp3;

	If(Exp exp1_, Exp exp2_, Exp exp3_) {
		exp1 = exp1_;
		exp2 = exp2_;
		exp3 = exp3_;
	}

	void printParseTree(String indent) {
		super.printParseTree(indent);

		String indent1 = indent + " ";
		String indent2 = indent1 + " ";

		IO.displayln(indent1 + indent1.length() + " if");
		exp1.printParseTree(indent2);
		IO.displayln(indent1 + indent1.length() + " then");
		exp2.printParseTree(indent2);
		IO.displayln(indent1 + indent1.length() + " else");
		exp3.printParseTree(indent2);
	}
}