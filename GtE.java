//Class for Gt expression
class GtE extends FunExp {
	GtE(ExpList e) {
		expList = e;
	}

	// get function operation
	String getOp() {
		return ">";
	}
}