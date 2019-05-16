/*
package filemanager;

import main.Pupil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaveFile
{
    private List<Pupil> pupilList;

    public SaveFile(List<Pupil> pupilList)
    {
        this.pupilList = pupilList;
    }

    public static void SaveToFile(List<Pupil> pupilList)
    {
        File pupilListData = new File("/home/dominik/Pobrane/studentdata.txt");

        try
        {
            //List<String> lines = Arrays.asList(pupilList.toString());
            List<String> lines = new ArrayList<>();
            Path filePath = Paths.get("/home/dominik/Pobrane/studentdata.txt");
            Files.write(filePath, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
*/
