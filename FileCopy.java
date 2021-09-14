import  java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileCopy
{
  
 public static void main(String[] args)
 {
  try{
  FileReader fr=new FileReader("D:\\JAVA\\Filesamp\\samptext.txt");
  FileWriter fw=new FileWriter("D:\\JAVA\\Filesamp\\samptextop.txt");
  String str="";
  int i;
  while((i=fr.read())!=-1){
   
    str+=(char)i;
   
  }
 
fw.write(str);
fr.close();
fw.close();
System.out.print("Copying Done");

 }
 catch(IOException e){
   System.out.println("Exception");
  }


 }

}
