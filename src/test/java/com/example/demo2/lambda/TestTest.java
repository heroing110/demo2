package com.example.demo2.lambda;

import com.example.demo2.TestRerfence.User;
import net.sf.json.JSONArray;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TestTest {

    @Test
    public void test(){
        Optional<List<Integer>> optional1 = Optional.ofNullable(List.of(1,2,3,4));
        Optional<List<Integer>> integers = optional1.filter((x) -> x.equals(1));
        List<Integer> list = optional1.get();
        String str = JSONArray.fromObject(list).toString();
        System.out.println(str);


        Optional<Map<String,Integer>> optional = Optional.ofNullable(Map.of("a",1,"b",2));
        Optional<Map<String, Integer>> a = optional.filter((k) -> k.containsKey("a"));
        Map<String, Integer> stringIntegerMap = a.get();
        stringIntegerMap.forEach((k,v)-> System.out.println(k+":"+v));

    }

    @Test
    public void test2(){
        List<String> list = List.of("hanmeimei","lilei");
        Optional<String> first = list.stream().filter(a -> "hanmeimei".equals(a)).findFirst();
    }

    @Test
    public void test3(){
        byte a= 1;
        long b=1;
        int eight = 013;//8进制
        int sixteen = 0x11;//16进制
        int two = 0b00000001;//2进制
        byte val4 = (byte) 0b11101001;
        int val5 =  0b11101001;
//        String c = 5;
        int a233 = 233;
        byte b233 = (byte)a233;
        char c = 333;
        double d =0.0/0;
        float f = 123456789.23456789f;
        double d2 = 2.4;
        Float f2 = 1111.1f;
        System.out.println(f2.toString(0.000000f));

        int[] as={1};
        as = new int[]{2};



    }

    @Test
    public void test4(){
        User user = new User();
        user.setName("123");
        test(user);
        System.out.println(user);
    }

    @Test
    public void test5(){
        String a = "0";
        char c = a.charAt(0);
        System.out.println((int)c);
    }

    @Test
    public void test6(){

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(i+"*"+j+"="+i*j);
                if(j<i){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }

    @Test
    public void test7(){
        int x = 7;
        int count = 1;
        for (int i = x; i > 0; i--) {
            //打空白
            for (int j = i-1; j >0 ; j--) {
                System.out.print(" ");
            }
            //打数字
            int num = i;
            for (int j = 0; j < count; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
            count=count+2;
        }
    }

    @Test
    public void test8(){
        String str = "abcde";
        try {
            System.out.println(substring(str, 0, 6));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void test(User user){
        user=null;
    }

    private String substring(String str,int begin,int end) throws Exception {
        if (StringUtils.isBlank(str)) {
            throw new NullPointerException("输入字符串为空");
        }
        if (begin>end) {
            throw new Exception("开始位置不能大于结束位置");
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        int length = chars.length;
        if(begin<0) begin = 0;
        if(end>length) end=length;
        for (int i = begin; i < end; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}