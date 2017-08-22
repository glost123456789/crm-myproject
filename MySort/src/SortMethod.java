
public class SortMethod {
	
	public boolean quickSort(int[] context,int min,int max){
		if(min>=max)
			return true;
		int flag=min;
		int i=min,j=max;
		while(i<j){
			while(j>flag && context[j]>=context[flag])
				j--;
			
			while(i<flag && context[i]<=context[flag])
				i++;
			
			if(i<flag)
			{
				int temp=context[i];
				context[i]=context[j];
				context[j]=temp;
				flag=i;
			}
			else if(j>flag){
				int temp=context[j];
				context[j]=context[flag];
				context[flag]=temp;
				flag=j;
			}
		}
		quickSort(context, min, flag-1);
		quickSort(context, flag+1, max);
		return true;
		//return context;
	}
	
	public boolean mergeSort(int[] context,int min,int max){
		if(max==min)
			return true;
		int med=(min+max)/2;
		mergeSort(context, min, med);
		mergeSort(context, med+1, max);
		int size=max-min+1;
		int[] cc=new int[size];
		for(int index=0;index<size;index++)
			cc[index]=context[index+min];
		int left=0,right=med-min+1;
		for(int index=0;index<size;index++)
			if(left<=med-min)
				if(right<=max-min)
					if(cc[left]<=cc[right])
						context[min+index]=cc[left++];
					else 
						context[min+index]=cc[right++];
				else
					context[min+index]=cc[left++];
			else 
				context[min+index]=cc[right++];
		return true;
	}
}
