package Objects.InnerClass;


public class OutClass {
	public InClass getInnerClass(final int Age, final String Name){
        return new InClass() {
            int age ;
            String name;
            //构造代码块完成初始化工作
            {
                if(Age > 0 && Age < 100){
                    this.age = Age;
                    this.name = Name;
                }
            }
            public String getName() {
                return name;
            }
            
            public int getAge() {
                return age;
            }
        };
    }
    
    public static void main(String[] args) {
        OutClass objOutClass = new OutClass();
        
        InClass objInClass = objOutClass.getInnerClass(101, "Test");
        System.out.println(objInClass.getName());
        
        InClass objInClass2 = objOutClass.getInnerClass(23, "Guest");
        System.out.println(objInClass2.getName());
    }
}