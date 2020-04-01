
//class for Ge expression
class GeE extends FunExp {
	GeE(ExpList exp) {
		expList = exp;
	}

	// get function operation
	String getOp() {
		return ">=";
	}
}