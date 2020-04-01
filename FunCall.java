//Class to perform a fuction call 
class FunCall extends FunExp {
	Id func;

	FunCall(Id i, ExpList expList_) {
		func = i;
		expList = expList_;
	}

	String getOp() {
		return func.id;
	}
}