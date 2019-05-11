package main;



import java.util.ArrayList;
import java.util.List;

public class Menu
{
    public static void FindMarek(List<Pupil> pupilListOne)
    {
        //for (Pupil pupil: pupilListOne)
        for (int i = 0; i < pupilListOne.size(); i++)
        {
            if (pupilListOne.get(i).getName() == "Marek")
            {
                System.out.println("Marek na pozycji: " + i);
            }
        }
    }

    public static void SumAge(List<Pupil> pupilListTwo)
    {
        int sum = 0;

        for (int i = 0; i < pupilListTwo.size(); i++)
        {
            if (pupilListTwo.get(i).getName().charAt(0) == 'A')
            {
                sum += pupilListTwo.get(i).getAge();
            }
        }

        System.out.println("Wiek uczniów o imieniu uczniów na A: " + sum);
    }

    public static void main(String[] args)
    {
        List<Pupil> pupilList = new ArrayList<>();
        List<Pupil> pupilListOne = new ArrayList<>();
        List<Pupil> pupilListTwo = new ArrayList<>();

        pupilList.add(new Pupil("Marek", "Sosia", 32));
        pupilList.add(new Pupil("Marek", "Madziarek", 22));
        pupilList.add(new Pupil("Marek", "Gosia", 31));
        pupilList.add(new Pupil("Janek", "Pawełek", 2));
        pupilList.add(new Pupil("Jola", "Lojalna", 32));
        pupilList.add(new Pupil("Adam", "Bolek", 32));
        pupilList.add(new Pupil("Monia", "Maniana", 32));
        pupilList.add(new Pupil("Lojalna", "Jola", 32));
        pupilList.add(new Pupil("Zbigniew", "Zbyszek", 32));
        pupilList.add(new Pupil("Adam", "Mialczynski", 33));

        for (int i = 0; i < pupilList.size(); i++)
        {
            if (i%2 == 0)
            {
                pupilListOne.add(pupilList.get(i));
            }
            else
            {
                pupilListTwo.add(pupilList.get(i));
            }
        }


        FindMarek(pupilListOne);

        SumAge(pupilListTwo);

    }



}
