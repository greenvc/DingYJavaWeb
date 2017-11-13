package Generics;

/*
 * 使用自定义的数据类型作为泛型
 */
public class User {

    //为一个用户定义三个基本属性
    String name="";
    String sex="";
    int age=0;
   
    //利用构造方法传递参数 
    public User(String name, String sex,int age) {
       super();
       this.name =name;
       this.sex =sex;
       this.age =age;
    }
   
    //各个参数的get和set方法
    public String getName() {
       return name;
    }
    public void setName(String name) {
       this.name =name;
    }
    public String getSex() {
       return sex;
    }
    public void setSex(String sex) {
       this.sex =sex;
    }
    public int getAge() {
       return age;
    }
    public void setAge(int age) {
       this.age =age;
    }
}