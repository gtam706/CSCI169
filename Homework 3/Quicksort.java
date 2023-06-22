public class Quicksort{
    public static void main(){
        
    }
    public int partition(int[]input, int p, int r){
        int pivot = input[r];
        while(p < r){
            while(input[p] < pivot){
                p++;
            }
            while(input[r] > pivot){
                r--;
            }
            if ( input[p] == input[r] ){
                p++;
            }
            else if ( p < r )
            {
                int tmp = input[p];
                input[p] = input[r];
                input[r] = tmp;
            }
        }
        return r;
    }
    public void quicksort(int[]input, int p, int r){
        if(p<r){
            int j = partition(input,p,r);
            quicksort(input, p, j-1);
            quicksort(input, j+1, r);
        }
    }
}