package pattern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class FilesMethods {

    private static String getPathToDirectory(){
        System.out.println("Working Directory = " + System.getProperty("user.home"));
        return System.getProperty("user.home") + "\\Desktop\\cardsForChristmas";
    }

    // new directory on desktop
    public static void newDirectory(){
        File f = new File(FilesMethods.getPathToDirectory());
        //check if directory can be created
        if(f.mkdir()){
            System.out.println("Directory has been created successfully!");
        }
        else {
            System.out.println("Directory cannot be created.");
        }
    }
    // new file:
    public static void newFile(Person[] arr, int i, List <Integer> list) throws IOException {
        FileWriter file = new FileWriter(FilesMethods.getPathToDirectory() + "\\" + arr[i].getName() + ".txt");
        while(arr[i].getName().equals(arr[list.get(0)].getName())){
            Collections.shuffle(list);
        }
        file.write(arr[list.get(0)].getName());
        file.close();
    }
}
