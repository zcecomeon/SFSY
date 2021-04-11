
public class practice1_1 {
    public static void main(String args[])
    {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        //practice1_3.quickSort(arr, 0, arr.length-1);//先对数进行排序，然后选择
        Find a=new Find();
        boolean result=a.pairInSortedArray(arr,arr.length ,9);
        System.out.println(result);
    }
}

class Find{

    boolean pairInSortedArray(int arr[], int n, int x)
    {
        int length = arr.length;
        practice1_3.quickSort(arr, 0, length-1);

        if(arr[0] >= x){
            return false;
        }
        int i = 0;
        --length;
        while(i < length){
            if(arr[i] + arr[length] == x){
                return true;
            }else if(arr[i] + arr[length] > x){
                --length;
            }else{
                ++i;
            }
        }
        return false;
    }

}