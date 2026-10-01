class Declare {
    private int age = 18;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




public class privetV {
    public static void main(String[] args) {
        Declare obj = new Declare();
        obj.setAge(18);
        System.out.println(obj.getAge());
    }
}