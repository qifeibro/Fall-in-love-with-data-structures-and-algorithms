
public class Main {

	public static void main(String[] args) {
		// int array[] = new int[] {11, 22, 33};
		
		MyArrayList list = new MyArrayList();
		list.add(99);
		list.add(88);
		list.add(77);
		list.add(66);
		list.add(55);
		
		list.remove(0);
		Assert.test(list.get(0) == 88);
		Assert.test(list.size() == 4);
		
		list.set(3, 80);
		
//		if (list.get(3) != 80) {
//			throw new IllegalArgumentException("test failed");
//		}
		Assert.test(list.get(3) == 80);
		
		for (int i = 0; i < 30; ++i) {
			list.add(i);
		}
		
		System.out.println(list);
	}
}
