import nu.pattern.OpenCV;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class App {

    static {
        OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        Mat newImage = Imgcodecs.imread(App.class.getResource("apple.jpg").getPath(),Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
        GUI gui = new GUI("Smooth Filter example", newImage);
        gui.init();
    }
}
