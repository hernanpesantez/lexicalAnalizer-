//class for adding or expression
class OrE extends FunExp {
	OrE(ExpList e) {
		expList = e;
	}

	// getting function operation nor
	String getOp() {
		return "or";
	}
}