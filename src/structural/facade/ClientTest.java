package structural.facade;

import java.io.File;

public class ClientTest {
    VideoConversionFacade converter = new VideoConversionFacade();
    File file = converter.convertVideo("input.ogg" , "mp4");
}
