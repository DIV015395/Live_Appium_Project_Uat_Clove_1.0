package org.utils;
import java.util.Base64;
public class ImageComparison {
    private static boolean compareImages(byte[] image1, byte[] image2) {
        String encodedImage1 = Base64.getEncoder().encodeToString(image1);
        String encodedImage2 = Base64.getEncoder().encodeToString(image2);
        return encodedImage1.equals(encodedImage2);
    }
}
