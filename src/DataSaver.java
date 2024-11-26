import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import static java.nio.file.StandardOpenOption.CREATE;
public class DataSaver {


        public static void main(String[] args)
        {

            ArrayList<String> recs = new ArrayList<>();
            String fileName = "";




            File workingDirectory = new File(System.getProperty("user.dir"));
            Path file = Paths.get(workingDirectory.getPath() + "\\src" + "\\" + fileName + ".csv");

            try
            {

                OutputStream out =
                        new BufferedOutputStream(Files.newOutputStream(file, CREATE));
                BufferedWriter writer =
                        new BufferedWriter(new OutputStreamWriter(out));


                for(String rec : recs)
                {
                    writer.write(rec, 0, rec.length());
                    writer.newLine();

                }
                writer.close();
                System.out.println("Data file written!");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }


}
