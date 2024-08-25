package Project1;

import java.util.Arrays;

public class DynamicArray<T>
{

    private int size;

    private Object [] arrayList;


    public DynamicArray(int size){
        this.size =  size;
        arrayList = new Object[size];
        for(int i = 0; i < size; i++){
            arrayList[i] = null;
        }


    } // O(1)

    public void set(int index, T obj){
        arrayList[index] = obj;
    } // O(1)

    public T get(int index){
        return  (T) (arrayList[index]);

    } // O(1)

    public int size(){
        return size;
    } // O(1)

    @Override
    public String toString() {
        return Arrays.toString(arrayList);
    }
}
