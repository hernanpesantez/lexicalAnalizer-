//Class to add * expression
class MulE extends FunExp {
	MulE(ExpList e) {
		expList = e;
	}

	// Getting function operation
	String getOp() {
		return "*";
	}
}