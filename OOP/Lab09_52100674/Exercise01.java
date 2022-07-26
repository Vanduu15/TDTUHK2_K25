import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercise01 {
    public static String data(String path){
        String tmp="";
        try{
            File file = new File(path);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                tmp+=sc.nextLine();
            }

        }catch(Exception e){
            System.out.println("Error while reading");
            return tmp;
        }
        return tmp;
    }

    
    public static void main(String[] args) {

        String path="./test";
        
        System.out.println("Enter a file name: ");
        boolean exists=false;
        String check = System.console().readLine();
        try {
            File file = new File(path);
            if(file.isDirectory()){
                File[] listFile= file.listFiles();
                for(File f: listFile){
                    if(check.equals(f.getName())){
                        exists=true;
                        break;
                    }
                }
            }
            if(!exists){
                System.out.println("File not found");
            }else{
                System.out.println("File found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String path1="./test//a.txt";
        try {
            File file = new File(path1);
            if(file.isDirectory()){
                System.out.println("Folder");
            }else if(file.isFile()){
                System.out.println("File");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        path1="./test//test1";
        String data="";
        try{
            File file = new File(path1);
            if(file.isDirectory()){
                File[] listFile= file.listFiles();
                for(File f: listFile){
                    String path_tmp=path1+"//"+f.getName();
                    data+=data(path_tmp);
                }
            }else{
                data+=data(path1);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        try{
            File file = new File(path);
            File[] listFile= file.listFiles();
            for(File f: listFile){
                if(f.isFile()){
                    FileWriter fw = new FileWriter(f);
                    fw.write(data);
                    fw.close();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        path1 = "./test//a.txt";
        try{
            File file = new File(path1);
            Scanner input = new Scanner(file);
            int max=0;
            while(input.hasNext()){
                String tmp=input.next();
                if(tmp.length()>max){
                    max=tmp.length();
                }
            }
            System.out.println("Max String is: "+max);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}