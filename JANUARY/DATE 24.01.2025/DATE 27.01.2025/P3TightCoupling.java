public class P3TightCoupling {
    public static void main(String[] args) {
        Box b = new Box(5,5,5);
        System.out.println("Volume: "+b.volume);
    }
}
class Box{
    public int volume;
    Box(int length,int width,int height){
        this.volume = length*width*height;
    }
}
