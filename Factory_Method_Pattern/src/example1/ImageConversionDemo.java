package example1;

interface ImageConverter {
	void convert(String inputFile, String outputFile);
}

class JPGImageConverter implements ImageConverter {

	@Override
	public void convert(String inputFile, String outputFile) {
		System.out.println("Converting" + inputFile + "to JPG format...");
		System.out.println("Saved as " + outputFile + ".jpg");
	}
}

class PNGImageConverter implements ImageConverter {

	@Override
	public void convert(String inputFile, String outputFile) {
		System.out.println("Converting" + inputFile + "to PNG format...");
		System.out.println("Saved as " + outputFile + ".png");
	}
}

abstract class ImageConverterFactory{
	abstract ImageConverter createImageConverter();
}

class JPGConverterFactory extends ImageConverterFactory{

	@Override
	ImageConverter createImageConverter() {
		return new JPGImageConverter();
	}
	
}

class PNGConverterFactory extends ImageConverterFactory{

	@Override
	ImageConverter createImageConverter() {
		return new PNGImageConverter();
	}
	
}

public class ImageConversionDemo {

	public static void main(String[] args) {
		ImageConverterFactory jpgF = new JPGConverterFactory();
		ImageConverter jpgC = new JPGImageConverter();
		jpgC.convert("input", "output");
		System.out.println();
		jpgF.createImageConverter().convert("input2", "output2");
		System.out.println();
		
		ImageConverterFactory pngF = new PNGConverterFactory();
		ImageConverter pngC = new PNGImageConverter();
		pngC.convert("input", "output");
		System.out.println();
				
		pngF.createImageConverter().convert("input2", "output2");
	}
}
