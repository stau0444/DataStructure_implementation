import java.util.zip.ZipEntry;

public class ArrayImpl {
    private int [] intArr;
    int size;
    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public ArrayImpl(){
        size = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }
    public ArrayImpl(int size){
        size = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num){
        if(size >= ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }
        intArr[size++] = num;
    }

    public int get(int position){
        return intArr[position];
    }

    public void replace(int position , int num){
        int i;
        if(position < 0 || position > size){
            System.out.println("Error , Error Num :"+ERROR_NUM);
            return;
        }
        if(size >= ARRAY_SIZE){
            System.out.println("Array full , Error Num :"+ERROR_NUM);
            return;
        }
        for(i = size-1 ; i>=position; i--){
            intArr[i+1] = intArr[i];
        }
        intArr[position] = num ;
        size ++;
    }
    public int removeElement(int position){
        if(size == 0){
            System.out.println("Array is Empty");
            return ERROR_NUM;
        }
        if(position < 0 || position > size -1){
            System.out.println("wrong position");
            return ERROR_NUM;
        }
        int ret = intArr[position];
        for (int i = position ; i<size-1; i++){
            intArr[i] = intArr[i+1];
        }
        size --;
        return ret;
    }

    public int size(){
        return size;
    }
}



