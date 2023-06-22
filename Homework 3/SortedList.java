import java.util.Iterator;

class SortedList implements Iterable<Integer>{
    private int array[];
    private int end;
    public SortedList(){
        array = new int[0];
        end = 0;
    }
    public SortedList(int arr[]){
        this.array = arr;
        end = arr.length-1;
        quicksort(0, end);
    }
    public int binsearch(int search){
        int n=array.length;
        int first, last, middle;
        first  = 0;
        last   = n - 1;
        middle = (first + last)/2;

        while( first <= last )
        {
            if ( array[middle] < search )
                first = middle + 1;
            else if ( array[middle] == search )
            {
                return middle;
            }
            else
                last = middle - 1;

            middle = (first + last)/2;
        }

        return -1;
    }
    public int partition(int p, int r){
        int pivot = array[r];
        while(p < r){
            while(array[p] < pivot){
                p++;
            }
            while(array[r] > pivot){
                r--;
            }
            if ( array[p] == array[r] ){
                p++;
            }
            else if ( p < r )
            {
                int tmp = array[p];
                array[p] = array[r];
                array[r] = tmp;
            }
        }
        return r;
    }
    public void quicksort(int p, int r){
        if(p<r){
            int j = partition(p,r);
            quicksort(p, j-1);
            quicksort(j+1, r);
        }
    }
    public void insert(int x){
    	int [] storage = new int[array.length + 1];
    	for(int i = 0; i < array.length; i++) {
    		storage[i] = array[i];
    	}
    	storage[array.length] = x;
    	this.array = storage;
    	end++;
    	quicksort(0,end);
    }
    public void print(){
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }
	public Iterator<Integer> iterator() {
		return new sortedIterator();
		
	}
	class sortedIterator implements Iterator<Integer>{
		int current = 0;
		@Override
		public boolean hasNext() {
			return current + 1 < array.length? true:false;
		}

		@Override
		public Integer next() {
			if(!hasNext()) {
				System.out.println("no next value exsists");
				return null;
			}
			else {
				current+=1;
				return array[current];
			}
		}
	}
}
