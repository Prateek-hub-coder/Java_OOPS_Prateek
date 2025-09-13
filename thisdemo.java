public class thisdemo {
    int a,b;
    public void get(int x,int y){
        a=x;
        b=y;
    }
    public void put(){
        System.out.println("a ="+a);
        System.out.println("b = "+b);
    }
}
class Demo{
    public static void main(String[] args) {
        thisdemo obj=new thisdemo();
        obj.get(10, 20);
        obj.put();
    }
}
