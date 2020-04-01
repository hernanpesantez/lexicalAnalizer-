
//Class header to derive the following
// ⟨header⟩ → ⟨fun name⟩ ⟨parameter list⟩

class Header {
	String funName;
	ParameterList parameterList;

	Header(String fm, ParameterList pl) {
		funName = fm;
		parameterList = pl;
	}

	void printParseTree(String indent) {
		IO.displayln(indent + indent.length() + " <header>");
		String indent1 = indent + " ";
		IO.displayln(indent1 + indent1.length() + " <fun name> " + funName);
		IO.displayln(indent1 + indent1.length() + " <parameter list>");
		String indent2 = indent1 + " ";

		ParameterList p = parameterList;
		while (p != null) {
			IO.displayln(indent2 + indent2.length() + " " + p.id);
			p = p.parameterList;
		}
	}
}