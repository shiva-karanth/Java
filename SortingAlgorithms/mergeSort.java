public class mergeSort {
    public static final void printArray(int a[]){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static final void merge(int a[], int lb,int mid,int ub){
        int n1 = mid-lb+1;
        int n2 = ub-mid;
        int i,j,k;
    
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];
    
        for(i=0;i<n1;i++){
            LeftArray[i] =a[lb+i];
        }
        for(i=0;i<n2;i++){
            RightArray[i] =a[mid+1+i];
        }
        i=0;
        j=0;
        k=lb;
    
        while (i<n1 && j<n2)
        {
            if(LeftArray[i]<=RightArray[j]){
                a[k]=LeftArray[i];
                i++;
            }else{
                a[k]=RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k]=LeftArray[i];
            i++;
            k++;
        }
        while (j<n2)
        {
            a[k]=RightArray[j];
            j++;
            k++;
        }
    }
    public static final void mergeSort(int a[], int lb, int ub){  
        if (lb < ub)   
        {  
            int mid = (lb + ub) / 2;  
            mergeSort(a, lb, mid);  
            mergeSort(a, mid + 1, ub);  
            merge(a, lb, mid, ub);  
        }  
    }  
    public static void main(String[] args) {
                int a[]={11,92,83,24,54,16,97};
                System.out.println("Before Sorting : ");
                printArray(a);
                mergeSort(a,0,a.length-1);
                System.out.println();
                System.out.println("After Sorting : ");
                printArray(a);
        
    }
}
