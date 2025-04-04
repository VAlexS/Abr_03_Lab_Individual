package clases.listas;

public class IntVector implements IntList {

    private int[] array;
    private int size;

    public IntVector(){
        array = new int[20];
        size = 0;
    }


    @Override
    public void add(int number) {
        if (size == array.length){
            int newLength = array.length * 2;
            int[] newArray = new int[newLength];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size)
            throw new IndexOutOfBoundsException("indice fuera de rango");
        return array[id];
    }

    @Override
    public void printArray() {
        for (int num: array)
            System.out.println(num);
    }

    public int[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }
}
