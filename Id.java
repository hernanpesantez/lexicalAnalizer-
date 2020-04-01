//Class for adding Id expression 
class Id extends Exp {
	String id;

	Id(String id_) {
		id = id_;
	}

	void printParseTree(String indent) {
		super.printParseTree(indent);
		String indent1 = indent + " ";
		IO.displayln(indent1 + indent1.length() + " " + id);
	}
}