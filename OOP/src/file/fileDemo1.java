package file;

import java.io.File;

// Create Folder and File
public class fileDemo1 {
    public static void main(String[] args) {
        File dir = new File("person"); //  customized path and then name (use forward slash)
        dir.mkdir(); // directory will be created

        String dirLocation = dir.getAbsolutePath();
        System.out.println(dirLocation);

        System.out.println(dir.getName());

            File file1 = new File(dirLocation+"/Student.txt");
            File file2 = new File(dirLocation+"/Teacher.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();

        }catch (Exception e){
            System.out.println(e);
        }

        if (file1.exists()){
            System.out.println("File exists");
        }
//        file2.delete();

    }
}
