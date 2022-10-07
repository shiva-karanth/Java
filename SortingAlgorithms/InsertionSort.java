public class InsertionSort {
    public static final void printArray(int a[]){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
            int a[]={11,92,83,24,54,16,97};
            System.out.println("Before Sorting : ");
            printArray(a);
            for(int i=1;i<a.length;i++){
                int key = a[i];
                int j = i-1;
                while(j>=0 && a[j]>key){
                    a[j+1]=a[j];
                    j-=1;
                }
                a[j+1]=key;
            }
            System.out.println();
            System.out.println("After Sorting : ");
            printArray(a);
        }
}
