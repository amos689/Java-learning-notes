package _24Array;

/*
    二分查找
        一直折半, 直到中间那个元素恰好是被查找的元素
        二分查找前必须先经过排序
 */
public class _17BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 8};
        int tar = 2;
        int low = 0, high = arr.length - 1, mid;
        while (low <= high) {
            mid = (high + low) / 2;
            if (tar > arr[mid]) {
                low = mid + 1;
            } else if (tar < arr[mid]) {
                high = mid - 1;
            } else {
                System.out.println("找到了.");
                break;
            }
        }

    }
}
