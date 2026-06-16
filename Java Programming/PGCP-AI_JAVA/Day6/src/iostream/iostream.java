package iostream;

import java.io.*;

public class iostream {
    public static void main(String[] args) throws IOException {

        FileInputStream in =null;
        FileOutputStream out = null;

        FileReader inReader= null;
        FileWriter outWriter =null;
        try {
//            in = new FileInputStream("TajMahal.jpg");
//            out = new FileOutputStream("output.jpg");
//            String destination= "output.jpg";
//            int v;
//            while ((v = in.read()) != -1) {
//                out.write(v);
//            }
//
//            in.close();
//            out.close();

            inReader = new FileReader("TajMahal.jpg");
            outWriter = new FileWriter("output1.jpg");

            int v=0;
            while((v= inReader.read())!=-1){
                outWriter.write(v);
            }
            inReader.close();
            outWriter.close();
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
