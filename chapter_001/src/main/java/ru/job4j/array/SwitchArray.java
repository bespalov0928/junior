package ru.job4j.array;

/**
 * class SwitchArray Перемещение жлементов в массиве
 * @author bespalov
 */
public class SwitchArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < nums.length; index++) {
            System.out.println(nums[index]);
        }
    }

    /**
     * Меняет местами первый и последний элемент  в массиве
     * @param array массив
     * @return массив
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * меняет местами элементы в массиве по индексу source dest
     * @param array  - исходный массив
     * @param source - индекс элемента, который нужно заменить
     * @param dest   - индекс элемента,  для замены
     * @return возвращаем обработанный массив
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }


}
