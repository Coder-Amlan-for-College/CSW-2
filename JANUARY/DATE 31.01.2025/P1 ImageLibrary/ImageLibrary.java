import java.util.*;
class ImageLibrary {
   ArrayList<Image> imageList = new ArrayList<>();
   void insertImage(Image image){
       imageList.add(image);
   }
   void searchImage(Image image){
        if(imageList.contains(image)){
            System.out.println("Image Exists");
        }
        else{
            System.out.println("Image Does Not Exist");
        }
   }
   void getImage(){
     for(int i=0;i<imageList.size();i++){
          System.out.println(imageList.get(i));
     }
   }
}
