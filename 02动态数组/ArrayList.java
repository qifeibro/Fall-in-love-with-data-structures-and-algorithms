package com.mj;

public class ArrayList {
    /**
     * 元素的数量
     */ 
    private int size; //私有成员变量
    /**
     * 所有的元素
     */
    private int[] elements;
    
    private static final int DEFAULT_CAPACITY = 10; // 静态私有常量，java里常量推荐大写，final表示常量，static表示静态，静态能保证 DEFAULT_CAPACITY 内存永远只有一份
    
    public ArrayList(int capacity) {
        capcity = 
        elements = new int[capacity];
    }
    
    public ArrayList() { // 无参的构造函数
         //elements = new int[DEFAULT_CAPACITY];
         this(DEFAULT_CAPACITY);
    }
    
    /**
     * 清除所有元素
     */
    public void clear() {
        
    }
    
    /**
     * 元素的数量
     * @return
     */
    public int size() {
        return 0;
    }
    
    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty() {
        return false;
    }
    
    /**
     * 是否包含某个元素
     * @param element
     * @return
     */
    public boolean contains(int element) {
        return false;
    }
    
    /**
     * 添加元素到尾部
     * @param element
     */
    publice void add(int element) {
        
    }
    
    /**
     * 获取index位置到元素
     * @param index
     * @return
     */
    public int get(int index) {
        return 0;
    }
    
    /**
     * 设置index位置的元素
     * @param index
     * @param element
     * @return 原来的元素
     */
    public int set(int index, int element) {
        return 0;
    }
    
    /**
     * 在index位置插入一个元素
     * @param index
     * @param element
     */
    public void add(int index, int element) {
        
    }
    
    /**
     * 删除index位置的元素
     * @param index
     * @return
     */
    public int remove(int index) {
        return 0;
    }
    
    /**
     * 查看元素的索引
     * @param element
     * @return
     */
    public int indexOf(int element) {
        return -1;
    }
}
