public class BubbleSort{
    public static final void printArray(int a[]){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={11,92,83,24,54,16,97};
        System.out.println("Before Sorting : ");
        printArray(a);
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting : ");
        printArray(a);
    }
}
