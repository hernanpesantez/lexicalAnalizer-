//class to add function expressions
// ⟨fun exp⟩ → ⟨fun op⟩ ⟨exp list⟩
abstract class FunExp extends Exp {
	ExpList expList;

	abstract String getOp();

	void printParseTree(String indent) {
		// calling super at Exp
		super.printParseTree(indent);
		String indent1 = indent + " ";
		IO.displayln(indent1 + indent1.length() + " <fun exp>");

		String indent2 = indent1 + " ";
		IO.displayln(indent2 + indent2.length() + " " + getOp());
		IO.displayln(indent2 + indent2.length() + " <exp list>");

		String indent3 = indent2 + " ";

		ExpList p = expList;
		while (p != null) {
			p.exp.printParseTree(indent3);
			p = p.expList;
		}
	}
}