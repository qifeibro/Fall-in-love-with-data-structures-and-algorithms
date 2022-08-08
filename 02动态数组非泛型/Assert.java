
public class Assert {
	public static void test(boolean value) {
		try {
			if (!value) throw new Exception("assert failed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}