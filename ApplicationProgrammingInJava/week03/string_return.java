package week03;

public class string_return {
	
	static int[] makeArray() {
		int temp[]=new int[4];
		for(int i=0; i<temp.length; i++)
			temp[i]=i; //�迭�� ���Ҹ� 0,1,2,3���� �ʱ�ȭ
		return temp; //�迭 ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[];//�迭 ���۷��� ���� ����
		intArray=makeArray();
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i]+" "); //�迭 ��� ���� ���

	}

}
