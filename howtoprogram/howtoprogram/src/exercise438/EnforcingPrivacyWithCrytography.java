package exercise438;

public class EnforcingPrivacyWithCrytography {
	public static void main(String[] args) {
		int data = 2542;
		int encrytedValue = encryted(data, 7);
		System.out.println("encryted data from " + data + " -> " + encrytedValue);
	}

	public static int encryted(int data, int key) {
		int[] a = listDigit(data);
		int index = 0;
		while (index < a.length) {
			a[index] += key;
			index++;
		}
		int newData = Integer.parseInt(makeNewData(a, false));
		newData /= 10;
		a = listDigit(newData);
		int lastData = Integer.parseInt(makeNewData(a, true));
		return lastData;
	}

	private static int[] listDigit(int newData) {
		int divide = 1000;
		int[] array = {0,0,0,0};
		int index = 0;
		int temp = newData;
		while (divide > 0) {
			array[index] = temp / divide;
			temp -= array[index]*divide;
			divide /= 10;
			index++;
		}
		return array;
	}

	public static String makeNewData(int[] array, boolean swap) {
		if (swap) {
			return String.valueOf(array[0]) + String.valueOf(array[3])  + String.valueOf(array[2]) + String.valueOf(array[1]);
		} else {
			return String.valueOf(array[0]) + String.valueOf(array[1])  + String.valueOf(array[2]) + String.valueOf(array[3]);
		}
	}
}
