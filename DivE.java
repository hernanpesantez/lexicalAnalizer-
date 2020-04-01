
class DivE extends FunExp {
	// Adding expression for div
	DivE(ExpList exp) {
		expList = exp;
	}

	String getOp() {
		return "/";
	}
}