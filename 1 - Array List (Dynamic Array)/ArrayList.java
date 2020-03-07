public class ArrayList<T> {
    private T[] array;
    private int length = 0, capacity = 2;

    public ArrayList() { array = (T[]) new Object[capacity]; }

    public int size() { return length; }

    public boolean empty() { return length == 0; }

    public T get(int index) { return array[index]; }

    public void set(int index, T data) { array[index] = data; }

    public void clear() {
        length = 0;
        capacity = 2;
        array = (T[]) new Object[capacity];
    }

    public void add(T data) {
        if(length + 1 >= capacity) {
            capacity *= 2;
            T[] temporary_array = (T[]) new Object[capacity];

            for(int i = 0; i < length; i++)
                temporary_array[i] = array[i];

            array = temporary_array;
        }

        array[length++] = data;
    }

    public void remove(int index) {
        capacity = length-- - 1;
        T[] temporary_array = (T[]) new Object[capacity];

        for(int i = 0, j = 0; j < temporary_array.length; i++)
            if(i != index) temporary_array[j++] = array[i];

        array = temporary_array;
    }

    public void print() {
        for(int i = 0; i < length; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }
}
