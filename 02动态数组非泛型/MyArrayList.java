

public class MyArrayList {
    /**
     * 元素的数量
     */ 
    private int size; //私有成员变量
    /**
     * 所有的元素
     */
    private int[] elements;
    
    private static final int DEFAULT_CAPACITY = 10; // 静态私有常量，java里常量推荐大写，final表示常量，static表示静态，静态能保证 DEFAULT_CAPACITY 内存永远只有一份
    private static final int ELEMENT_NOT_FOUND = -1;
    
    public MyArrayList(int capacity) { // 构造函数
        capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
        elements = new int[capacity];
    }
    
    public MyArrayList() { // 无参的构造函数
         //elements = new int[DEFAULT_CAPACITY];
         this(DEFAULT_CAPACITY); // 无参的构造函数调用有参的构造函数，构造函数通过this相互调用
    }
    
    /**
     * 清除所有元素
     */
    public void clear() {
        //size = 0;
        if (size < 100) {
        	size= 0;
        } else {
        	elements = null;
        }
    }
    
    /**
     * 元素的数量
     * @return
     */
    public int size() {
        return size;
    }
    
    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * 是否包含某个元素
     * @param element
     * @return
     */
    public boolean contains(int element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }
    
    /**
     * 添加元素到尾部
     * @param element
     */
    public void add(int element) {
        // elements[size++] = element;
    	add(size, element);
    }
    
    /**
     * 获取index位置到元素
     * @param index
     * @return
     */
    public int get(int index) {
    	rangeCheck(index);
//    	if (index < 0 || index >= size) {
//    		throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//    	}
        return elements[index];
    }
    
    /**
     * 设置index位置的元素
     * @param index
     * @param element
     * @return 原来的元素
     */
    public int set(int index, int element) {
    	rangeCheck(index);
//    	if (index < 0 || index >= size) {
//    		throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//    	}
    	int old = elements[index];
    	elements[index] = element;
        return old;
    }
    
    /**
     * 在index位置插入一个元素
     * @param index
     * @param element
     */
    public void add(int index, int element) {
    	rangeCheckForAdd(index);
    	
    	ensureCapacity(size + 1);
    	
//    	if (index < 0 || index > size) {
//    		throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//    	}
    	for (int i = size - 1; i >= index; i--) {
			elements[i + 1] = elements[i];
		}
    	elements[index] = element;
    	size++;
    }
    
    /**
     * 删除index位置的元素
     * @param index
     * @return
     */
    public int remove(int index) {
    	rangeCheck(index);
//    	if (index < 0 || index >= size) {
//    		throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//    	}
    	int old = elements[index];
    	for (int i = index + 1; i <= size - 1; i++) {
			elements[i - 1] = elements[i];
		}
    	size--;
        return old;
    }
    
    /**
     * 查看元素的索引
     * @param element
     * @return
     */
    public int indexOf(int element) {
    	for (int i = 0; i < size; i++) {
    		if(elements[i] == element) return i; // 整数的比较直接用等号
    	}
        return ELEMENT_NOT_FOUND;
    }
    
    /**
     * 保证要有 capacity 的容量
     * @param capacity
     */
    private void ensureCapacity(int capacity) {
		int oldCapacity = elements.length;
		if (oldCapacity >= capacity)	return;
		
		// int newCapacity = oldCapacity * 1.5; // 浮点数计算比 位运算 整数运算 耗时
		// 新容量为旧容量的 1.5 倍
		int newCapacity = oldCapacity + (oldCapacity >> 1); // 左移1 << 1 相当于乘以2。右移1 >> 1 相当于除以2
    	int[] newElements = new int[newCapacity];
    	for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}
    	elements = newElements;
    	
    	System.out.println(oldCapacity + " expand to " + newCapacity);
	}
    
    private void outOfBounds(int index) {
    	throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    
    private void rangeCheck(int index) {
    	if (index < 0 || index >= size) {
    		outOfBounds(index);
    	}
	}
    
    private void rangeCheckForAdd(int index) {
    	if (index < 0 || index > size) {
    		outOfBounds(index);
    	}
	}
    
    @Override
    public String toString() {
    	// size=3, [99,88,77]
    	StringBuilder string = new StringBuilder();
    	string.append("size=").append(size).append(", [");
    	for (int i = 0; i < size; i++) {
    		if (i != 0) {
    			string.append(", ");
			}
    		string.append(elements[i]);
    		
//    		if (i != size - 1) {
//    			string.append(", ");
//    		}
    	}
    	string.append("]");
    	return string.toString();
    }
}
