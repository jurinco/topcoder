public class FormatAmt {

	public String amount(int dollars, int cents) {
		String ds = String.valueOf(dollars);
		StringBuilder b = new StringBuilder();
		b.append('$');

		for (int i = 0; i < ds.length(); ++i) {
			b.append(ds.charAt(i));

			if (ds.length() - 1 - i > 0 && (ds.length() - 1 - i) % 3 == 0)
				b.append(',');
		}

		b.append('.');
		if (cents < 10)
			b.append(0);
		b.append(String.valueOf(cents));

		return b.toString();
	}

}
