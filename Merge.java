import java.util.Arrays;
class MergeSort
{
  public static void main(String[] args)
  {

    int arr[]={10,33,8,4,24,66,44};
    MergeSort m=new MergeSort();
    int result[]=m.divide(arr);

    for(int i=0;i<result.length;i++)
    {
      System.out.println(result[i]);
    }


  }

  int[] divide(int ar[])
  {
    if(ar.length==1)
    {
      return ar;
    }
    int mid=ar.length/2;
    int left[]=divide(Arrays.copyOfRange(ar,0,mid));
    int right[]=divide(Arrays.copyOfRange(ar,mid,ar.length));

    return conquer(left,right);

  }


  int[] conquer(int left[],int right[])
  {
    int i=0;
    int j=0;
    int k=0;

    int newarray[]=new int[left.length+right.length];

    while(i<left.length&&j<right.length)
    {
      if(left[i]<right[j])
      {
        newarray[k]=left[i];
        i++;
        k++;
      }
      else
      {
        newarray[k]=right[j];
        j++;
        k++;
      }
    }

    while(i<left.length)
    {
      newarray[k]=left[i];
      i++;
      k++;
    }
    while(j<right.length)

 

    {

      newarray[k]=right[j];
      j++;
      k++;
    }      


      return newarray;
    }




  }
