import java.util.Arrays;
class Merge1
{
public static void main(String[]args)
{
	int arrr[]={12,90,87,65,43};
	Merge1 m=new Merge1();
	int result[]=m.divide(arrr);
	 
	for(int i=0;i<result.length;i++)
	{
		System.out.println(result[i]);
	}
}
int []divide(int arr[])
{
	if(arr.length==1)
	{
		return arr;
	}
	int mid=arr.length/2;
	int left[]=divide(Arrays.copyOfRange(arr,0,mid));
	int right[]=divide(Arrays.copyOfRange(arr,mid,arr.length));
	return conquere(left,right);
}
int[] conquere(int left[],int right[])
{
	int i=0;
	int j=0;
	int k=0;
	int ar[]=new int[left.length+right.length];
	while(i<left.length&&j<right.length)
	{
		if(left[i]<right[j])
		{
			ar[k]=left[i];
			i++;
			k++;
		}
		else
		{
			ar[k]=right[j];
			j++;
			k++;                   
		}
	}
	while(i<left.length)
	{
		ar[k]=left[i];
			i++;
			k++;
	}
	while(j<right.length)
	{
			ar[k]=right[j];
			j++;
			k++;                   

		
	}
	return ar;
}

	
}