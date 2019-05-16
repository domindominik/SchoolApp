package main;


import factory.StudentRandomFactory;
import filemanager.SaveToFile;
import java.util.Arrays;
import java.util.List;

public class Menu
{
    public static void FindMarek(List<Pupil> pupilListOne)
    {
        boolean marekExist = false;

        for (int i = 0; i < pupilListOne.size(); i++)
        {
            if (pupilListOne.get(i).getName() == "Marek")
            {
                System.out.println("Marek na pozycji: " + (i +1));
                marekExist = true;
            }
        }
        if (marekExist == false)
        {
            System.out.println("Marek nie został wylosowany");
        }
    }

    public static void SumAge(List<Pupil> pupilListTwo)
    {
        int sum = 0;

        for (int i = 0; i < pupilListTwo.size(); i++)
        {
            if (pupilListTwo.get(i).getName().startsWith("A"))
            {
                sum += pupilListTwo.get(i).getAge();
            }
        }

        System.out.println("Wiek uczniów o imieniu na A: " + sum);
    }

    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Agnieszka", "Joanna", "Patrycja", "Zuzanna", "Anna", "Tomasz", "Andrzej", "Adam", "Marek", "Patryk", "Edward", "Magda");
        List<String> surnames = Arrays.asList("Nowak", "Wójcik", "Kowalczyk", "Woźniak", "Mazur", "Krawczyk", "Kaczmarek", "Zając", "Król", "Dudek", "Kabel", "Konfident");

        StudentRandomFactory factory = new StudentRandomFactory();

        List<Pupil> pupilList = factory.resoultList(names, surnames, 40);

        SaveToFile saveToFile = new SaveToFile();
        saveToFile.saveToFile(pupilList);



        List<Pupil> pupilListOne = pupilList.subList(0, 20);
        List<Pupil> pupilListTwo = pupilList.subList(20, 40);

        System.out.println("Lista pierwsza: ");
        for (Pupil pupil: pupilListOne)
        {
            pupil.printInfo();
        }
        FindMarek(pupilListOne);

        System.out.println("\nLista druga: ");
        for (Pupil pupil: pupilListTwo)
        {
            pupil.printInfo();
        }
        SumAge(pupilListTwo);

    }



}
