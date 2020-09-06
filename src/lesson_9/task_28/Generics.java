package lesson_9.task_28;

public class Generics<T> {
    T[] massive;

    public T get(int index) {
        return massive[index];
    }
}
