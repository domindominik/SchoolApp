package filemanager;

import main.Pupil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveToFile
{
    public void saveToFile(List<Pupil> pupilList)
    {
        try
        {
            FileOutputStream f = new FileOutputStream(new File("pupils.dat"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(pupilList);
            f.close();
            o.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}