public class ImageLoader{
    private static final ImageLoader instance = new ImageLoader();
    public String string;

    private ImageLoader(){
        string = "Constructor is private";
    }
    public static ImageLoader getInstance(){
        return instance;
    }
    public static String loadImage(){
        return "Loaded successfully";
    }
}

    


