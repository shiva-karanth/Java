public class SelectionSort {
    public static final void printArray(int a[]){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={11,92,83,24,54,16,97};
        System.out.println("Before Sorting : ");
        printArray(a);
        for(int i=0;i<a.length-1;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp =a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
        System.out.println();
        System.out.println("After Sorting : ");
        printArray(a);

    }
}
