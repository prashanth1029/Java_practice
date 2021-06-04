import com.yaman.exceptions.FooRuntimeException;

public class MyFileUtils {

	public int substract10FromLargerNumber(int num) throws FooRuntimeException {
		if (num < 10) {
			throw new FooRuntimeException("number passed was smaller than 10");
		}
		return num - 10;
	}


}
