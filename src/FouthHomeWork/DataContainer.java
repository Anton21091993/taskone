    package FouthHomeWork;

    public class DataContainer<T> {

        T[] data = (T[]) new Object[3];


        public int add(T item) {
            for (int i = 0; i < data.length; i++) {
                data[i] = item;
            }


            data = (T[]) new Object[]{1, 23, null, null, null};

            return 0;
        }


        public void print() {
            return;
        }
    }






