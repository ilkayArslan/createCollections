public class MyArrayLists<T> {


    T[] arr ;
    private int capacity=10;
    private int elemansize=0;
    public MyArrayLists(){
        this.arr =(T[]) new Object[this.capacity];

    }
    public MyArrayLists(int capacity){
        this.capacity=capacity;
        this.arr =(T[]) new Object[this.capacity];
    }
    public void size(){
        System.out.println(this.elemansize);
    }
    public void add(T a){
        this.arr[this.elemansize] = a;
        elemansize++;
        if (this.elemansize == this.capacity){
            this.capacity *= 2;
            T[] temparr =(T[]) new Object[this.capacity];
            int index = 0;
            for (T tempa: this.arr) {
                temparr[index] = tempa;
                index++;
            }
            setArr(temparr);
        }

    }
    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getElemansize() {
        return elemansize;
    }

    public void setElemansize(int elemansize) {
        this.elemansize = elemansize;
    }
    public T get(int index){
        if (index<elemansize){
            return this.arr[index];
        }else{
            return null;
        }

    }
    public void remove(int index){
        if (index<elemansize){
            T[] temparr =(T[]) new Object[this.capacity];
            int i = 0;
            for (T tempa: this.arr) {
                if (arr[index] == tempa){
                    this.elemansize--;
                }else{
                    temparr[i] = tempa;
                    i++;
                }
            }
             setArr(temparr);

        }else{
            System.out.println((T[]) null);;
        }
    }
    public void set(int index,T data){
        if (index<elemansize){
            this.arr[index]= data;
            System.out.println("değiti");
        }else{
            System.out.println((T[]) null);
        }
    }
    public void gotoString(){
        System.out.print("[");
        for (T item:
             this.arr) {
            if (item == null){

            }else{
                if (item == arr[elemansize-1]){
                    System.out.print(item);
                }else{
                    System.out.print(item + ", ");
                }

            }

        }
        System.out.print("]");
    }
    public void clear(){
        this.elemansize=0;
        this.capacity=10;
        this.arr =(T[]) new Object[this.capacity];
    }
    public boolean isEmpty(){
        if (this.elemansize==0){
            return true;
        }else{
           return  false;
        }
    }
    public boolean contains(T data){
        int var = 0;
        for (T a:arr) {
            if (data==a){
                var++;
            }
        }
        if (var>0){
            return true;
        }else{
            return false;
        }
    }

}
