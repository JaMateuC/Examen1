package Programa;

public class Queue<T> {


        private int num = 0;
        private T[] vector;
        private int max ;


        public Queue(int n) {
            max = n;
            //vector= new T[n];
            vector = (T[]) new Object[n];
        }

        public void push(T t) {
            if(num != max)
                vector[num]=t;
            num++;
        }


        public T pop() {
            num--;
            return vector[num];
        }


        public int size() {
            return num;
        }

}
