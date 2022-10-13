public class QuickSort{
    public static final void printArray(int a[]){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static int partition(int a[],int lb, int ub){
        int pivot=a[lb];
        int i=lb+1;
        int j=ub;

        while (i<j){
            while (a[i]<=pivot){
                i++;
            }
            while (a[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp = a[lb];
        a[lb]=a[j];
        a[j]=temp;
        return j;
    }

    public static void quickSort(int a[], int lb , int ub){
        if(lb<ub){
            int loc = partition(a,lb,ub);
            quickSort(a,lb,loc-1);
            quickSort(a,loc+1,ub);
        }
    }

    public static void main(String[] args) {
        int a[]={11,92,83,24,54,16,97};
        System.out.println("Before Sorting : ");
        printArray(a);
        quickSort(a,0,a.length-1);
        System.out.println();
        System.out.println("After Sorting : ");
        printArray(a);

    }
}