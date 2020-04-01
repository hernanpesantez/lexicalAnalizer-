
//Class for defining funtion 
class FunctionDef extends FunctionDefList {
	Header header;
	Exp exp;

	FunctionDef(Header header_, Exp exp_) {
		header = header_;
		exp = exp_;
	}

	void printParseTree(String indent) {
		String indent1 = indent + " ";

		IO.displayln(indent + indent.length() + " <fun def>");
		header.printParseTree(indent1);
		exp.printParseTree(indent1);
		IO.displayln("");
	}
}