package ���¼ҽ�����4;

public class Ex07 extends Calculator {
	@Override
	public int add(int a, int b) { // �߻� �޼ҵ� ����
		return a + b;
	}
	@Override
	public int subtract(int a, int b) { // �߻� �޼ҵ� ����
		return a - b;
	}
	@Override
	public double average(int[] a) { // �߻� �޼ҵ� ����
		double sum = 0;
		for (int i = 0; i <a.length; i++)
			sum += a[i];
		return sum/a.length;
	}
	public static void main(String [] args) {
		Ex07 c = new Ex07();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int [] { 2,3,4 }));
	}
}
