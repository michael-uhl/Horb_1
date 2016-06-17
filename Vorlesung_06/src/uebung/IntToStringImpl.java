package uebung;

public class IntToStringImpl implements IntToString {

	@Override
	public String intToString(Integer input) {
		System.out.println(IntToString.konstant);
		return "" + input;
	}

}
