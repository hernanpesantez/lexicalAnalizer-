//class for adding integer exoression
class Int extends Exp {
	int intElem;

	Int(int int_) {
		intElem = int_;
	}

	void printParseTree(String indent) {
		super.printParseTree(indent);
		String indent1 = indent + " ";
		IO.displayln(indent1 + indent1.length() + " " + intElem);
	}
}