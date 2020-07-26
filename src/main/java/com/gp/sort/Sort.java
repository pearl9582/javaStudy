package com.gp.sort;

public class Sort {
    static void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    private static void printNums(int[] nums){
        for(int num : nums ){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    //插入排序。
    static void insertSort(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int cur = nums[i];
            int j = i-1;
            while(j>=0 && nums[j] > cur){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = cur;
        }
    }

    //希尔排序
    static void shellSort(int[] nums){

    }

    /**
     * 冒泡排序
     *
     * @param array
     * @return
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    swap(array, j,j+1);
                }
            }
        }
    }

    /**
     * 选择排序
     * @param array
     * @return
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) { //找到最小的数
                    minIndex = j; //将最小数的索引保存
                }
                swap(array, minIndex, i);
            }
        }
    }



    // 查找出中轴（默认是最低位low）的在numbers数组排序后所在位置
    public static int getMiddle(int[] numbers, int low,int high){
        //数组的第一个作为中轴
        int temp = numbers[low];
        while(low < high){
            while(low < high && numbers[high] > temp){
                high--;
            }
            //比中轴小的记录移到低端
            numbers[low] = numbers[high];
            while(low < high && numbers[low] < temp){
                low++;
            }
            //比中轴大的记录移到高端
            numbers[high] = numbers[low] ;
        }
        //中轴记录到尾
        numbers[low] = temp ;
        // 返回中轴的位置
        return low ;
    }
    public static void quickSort(int[] numbers,int low,int high)
    {
        if(low < high)
        {
            //将numbers数组进行一分为二
            int middle = getMiddle(numbers,low,high);
            //对低字段表进行递归排序
            quickSort(numbers, low, middle-1);
            //对高字段表进行递归排序
            quickSort(numbers, middle+1, high);
        }
    }

    public static void quick(int[] numbers)
    {
        //查看数组是否为空
        if(numbers.length > 0)
        {
            quickSort(numbers, 0, numbers.length-1);
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{3, 1, 7, 4, 9, 5, 0, 8, 2, 6};
        bubbleSort(nums);
        printNums(nums);
    }
}
