package hope;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;



public class please {
	

public static final String IMG = "one.png";

public static void main(String[] args) {

    BufferedImage img;
    openFile g = new openFile();
    g.openFile();
    try {
        img = ImageIO.read(new File(IMG));
        int[][] pixelData = new int[img.getHeight() * img.getWidth()][3];
        int[] rgb;

        int counter = 0;
        for(int i = 0; i < img.getHeight(); i++){
            for(int j = 0; j < img.getWidth(); j++){
                rgb = getPixelData(img, j, i, img.getWidth(), img.getHeight());

                for(int k = 0; k < rgb.length; k++){
                    pixelData[counter][k] = rgb[k];
                }

                counter++;
            }
        }


    } catch (IOException e) {
        e.printStackTrace();
    }

}


private static int[] getPixelData(BufferedImage img, int x, int y, int width, int height) {
int argb = img.getRGB(x, y);
openFile g = new openFile();
g.openFile();

int rgb[] = new int[] {
    (argb >> 16) & 0xff, //red
    (argb >>  8) & 0xff, //green
    (argb      ) & 0xff  //blue
};
// prints in a matrix form
//takes forever and needs to be removed
for(int i = 0; i < height;i++ )
{
	System.out.println("");
	for(int j = 0;j< width; j++)
	{
		System.out.print(" "+ rgb[0]+"-"+rgb[1]+"-"+rgb[2]);
	}
}


return rgb;
}

}