class Image{
    double imageHeight,imageWeight;
    long colorCode;
    Image(){
        this.imageHeight = 0.0;
        this.imageWeight = 0.0;
        this.colorCode = 0L;
    }
    Image(double imageHeight,double imageWeight, long colorCode){
        this.imageHeight = imageHeight;
        this.imageWeight = imageWeight;
        this.colorCode = colorCode;
    }
    void setImageHeight(double imageHeight){
        this.imageHeight = imageHeight;
    }
    void setImageWeight(double imageWeight){
        this.imageWeight = imageWeight;
    }
    void setColorCode(long colorCode){
        this.colorCode = colorCode;
    } 
    double getImageHeight() {
        return this.imageHeight;
    }
    
    double getImageWeight() {
        return this.imageWeight;
    }
    
    long getColorCode() {
        return this.colorCode;
    }
    
    @Override
  public String toString() {
    return "Image [Height=" + imageHeight + ", Weight=" + imageWeight + ", ColorCode=" + colorCode + "]";
}

    }
    