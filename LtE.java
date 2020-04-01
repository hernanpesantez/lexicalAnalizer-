//Class to add LT expression
class LtE extends FunExp {
	LtE(ExpList e) {
		expList = e;
	}

	// Getting function operation
	String getOp() {
		return "<";
	}
}