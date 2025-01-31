public class ImageController {
    public static void main(String[] args) {
        Image img = new Image();
        Image img1 = new Image(0.0,0.1,12);
        img1.setImageHeight(200);
        img1.setImageWeight(400);
        img1.setColorCode(123);
        ImageLibrary images = new ImageLibrary();
        images.insertImage(img);
        images.insertImage(img1);
        images.getImage();
    }
    
}
