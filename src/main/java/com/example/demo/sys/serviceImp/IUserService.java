package com.example.demo.sys.serviceImp;

import com.example.demo.sys.vo.UserVo;

import java.util.Map;

public interface IUserService {
    UserVo findUser(UserVo user);

    UserVo login(Map<String, Object> map) throws Exception;
}

class Person implements image,dz{

    @Override
    public void eat() {
        System.out.println("eat shit");
    }

    @Override
    public void sleep() {
        System.out.println("eat shi111t");
    }
}
interface dz{
    void eat();
}
interface image{
    void sleep();
}
class yys{

    public static void main(String[] args){
//        dz d= new Person();
//        ((Person) d).sleep();
//        d.eat();


        Integer[] arr = new Integer[]{2,5,17,5,2};
        int t;
        for (int i = 0 ; i<arr.length-1;i++) {
            for (int j = 0;j<arr.length;j++) {
                if (arr[j]>arr[i+1]) {
                    t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = t;
                }
            }
        }

        for (int i = 0 ; i<arr.length-1;i++) {
            System.out.println(arr[i]);
        }

    }

}
