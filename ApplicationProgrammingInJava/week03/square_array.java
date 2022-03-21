package week03;

public class square_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//정방형 배열
		System.out.print("정방형 배열");
		int i[][];
		i=new int[4][4];
		System.out.print(i);
		
		//비정방형 배열
		System.out.print("정방형 배열");
		int j[][];
		j=new int[4][];
		
		j[0]=new int[1];
		j[1]=new int[2];
		j[2]=new int[3];
		j[3]=new int[4];
		
		System.out.print(j);*/
		
		int intArray[][]=new int[4][];
		intArray[0]=new int [3];
		intArray[1]=new int [2];
		intArray[2]=new int [3];
		intArray[3]=new int [2];
		
		for (int i=0; i<intArray.length; i++)
			for(int j=0; j<intArray[i].length; j++)
				intArray[i][j]=(i+1)*10+j;
		
		for (int i=0; i<intArray.length; i++)
			for(int j=0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j]+" ");
		
			System.out.println();
	

}}
