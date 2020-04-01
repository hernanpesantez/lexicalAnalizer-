
class AddE extends FunExp
// Adding expression plu
{
	AddE(ExpList exp) {
		expList = exp;
	}

	String getOp() {
		return "+";
	}

}