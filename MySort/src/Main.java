
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortMethod sort=new SortMethod();
		int context[]={1,0,21,11,15,7,6,12,13,1,2,9,165};
		for(int c:context)
			System.out.print(c+"\t");
		System.out.println();
		
		sort.quickSort(context,0,context.length-1);
		for(int c:context)
			System.out.print(c+"\t");
		System.out.println();
		
		sort.mergeSort(context,0,context.length-1);
		for(int c:context)
			System.out.print(c+"\t");
		System.out.println();
	}

}
