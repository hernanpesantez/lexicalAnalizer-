//class to add a list of functions
abstract class FunctionDefList {
	void printParseTree(String indent) {
		FunctionDefList p = this;

		while (p.getClass() == MultipleFunDef.class) {
			((MultipleFunDef) p).functionDef.printParseTree(indent);
			p = ((MultipleFunDef) p).functionDefList;
		}

		p.printParseTree(indent); // p is the last FunDef
	}
}