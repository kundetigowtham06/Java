class MinHeap {
    int a[];
    int heapsize;
    int maxsize;

    MinHeap(int ms) {
        maxsize = ms;
        heapsize = 0;
        a = new int[maxsize];
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int lchild(int i) {
        return 2 * i + 1;
    }

    int rchild(int i) {
        return 2 * i + 2;
    }

    void insert(int key) {
        if (heapsize == maxsize) {
            System.out.println("heap overflow");
            return;
        }
        int i = heapsize;
        a[i] = key;
        heapsize++;
        while (i != 0 && a[i] < a[parent(i)]) {
            int temp = a[i];
            a[i] = a[parent(i)];
            a[parent(i)] = temp;
            i = parent(i);
        }
    }

    void heapify(int i) {
        int min = i;
        int l = lchild(min);
        int r = rchild(min);
        if (l < heapsize && a[l] < a[min])
            min = l;
        if (r < heapsize && a[r] < a[min])
            min = r;
        if (min != i) {
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            heapify(min);
        }
    }

    void remove() {
        if (heapsize == 0) {
            System.out.println("underflow");
            return;
        }
        if (heapsize == 1) {
            heapsize--;
        } else {
            a[0] = a[heapsize - 1];
            heapsize--;
            heapify(0);
        }
    }

    int getMin() {
        return maxsize;
    }

    int currmin() {
        return heapsize;
    }

    public static void main(String[] args) {
        MinHeap m = new MinHeap(15);
        int ele[] = {1, 2, 3, 4, 5};
        for (int i : ele) {
            m.insert(i);
        }
        m.remove();
        for (int j = 0; j < m.heapsize; j++) {
            System.out.println(m.a[j]);
        }
        System.out.println("curr min :" + m.currmin());
        System.out.println("minsize :" + m.getMin());
    }
}
