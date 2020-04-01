
//Class for adding expression for floatp
class Floatp extends Exp {
	float floatElem;

	Floatp(float f_) {
		floatElem = f_;
	}

	void printParseTree(String indent) {

		// call super at Exp
		super.printParseTree(indent);
		String indent1 = indent + " ";
		IO.displayln(indent1 + indent1.length() + " " + floatElem);
	}
}