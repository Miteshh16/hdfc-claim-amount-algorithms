package Store;

import java.util.Arrays;
import Exception.IndexInvalidException;
import Exception.StoreFullException;

public class ClaimAmountStore {

    int[] data;
    int size;

    public ClaimAmountStore() {
        data = new int[16];
        size = 0;
    }

    public void add(int amount) {
        if (size == data.length) {
            throw new StoreFullException("Store is full");
        }

        data[size] = amount;
        size++;
    }

    public int insert(int index, int amount) {
        if (index < 0 || index > size) {
            throw new IndexInvalidException("Invalid index");
        }

        if (size == data.length) {
            throw new StoreFullException("Store is full");
        }

        int shifted = 0;

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
            shifted++;
        }

        data[index] = amount;
        size++;

        return shifted;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexInvalidException("Invalid index");
        }

        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
    }

    public int[] toArray() {
        return Arrays.copyOf(data, size);
    }
}