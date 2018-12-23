package com.heima.Demo04VarArgs;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description 可变参数
 * 使用前提，当方法的参数列表数据类型已经确定，但参数的个数不确定，就可以使用可变参数
 * 使用格式
 * 修饰符 返回值类型 方法名（数据类型...变量名）｛｝
 * 可变参数原理
 *      可变参数底层就是一个数组，根据传递的参数个数不同，会创建不同长度的数组，来存储这些参数
 *      传递的参数个数，可以是0个（不传递），1，2...多个
 *  注意事项：
 *      一个方法的参数列表，只能有一个可变参数
 *      如果方法的参数有多个，那么可变参数必须卸载参数列表的末尾
 *  可变参数的特殊写法
 *  public static Object method(Object...o){}
 * @time 2018/12/23 15:36
 * @see
 */
public class DemoVarArgs {
    public static void main(String[] args) {
        int i;
        i = add(0,5,3,8,852,456,951,753);
        System.out.println(i);
    }
    /**
     * 定义计算0-n整数和的方法
     * 已知，计算整数和，数据类型已经确定int
     * 但参数的个数不确定，不知道要计算几个整数的和，就可以使用可变参数
     */
    public static int add(int... arr){
        System.out.println(arr);
        System.out.println(arr.length);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
