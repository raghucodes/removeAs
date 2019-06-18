package tdd;
public class NoAs {
	String str;
	public NoAs(String string) {
		str = string.toUpperCase();
	}
	public String removeAs() {
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		if(sb.charAt(0)=='A' && sb.charAt(1) == 'A') {
			sb.deleteCharAt(0);
			sb.deleteCharAt(0);
			return sb.toString();
		}
		if(sb.charAt(0) == 'A')
			sb.deleteCharAt(0);
		if(sb.charAt(1) == 'A')
			sb.deleteCharAt(1);
		return sb.toString();
	}
}
