package factory;

import main.Pupil;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class StudentRandomFactory
{
    public List<Pupil> resoultList(List<String> names, List<String> surnames, int numberOfPupils)
    {
        List<Pupil> resoultList = new LinkedList<>();

        Random random = new Random();
        random.setSeed(System.currentTimeMillis() * numberOfPupils * names.size() * surnames.size());

        int nameIndex, surnameIndex;

        for (int i = 0; i < numberOfPupils; i++)
        {
            nameIndex = random.nextInt(names.size());
            surnameIndex = random.nextInt(surnames.size());

            resoultList.add(new Pupil(names.get(nameIndex), surnames.get(surnameIndex), random.nextInt(14) + 15, (i+1)));
        }
        return resoultList;
    }
}