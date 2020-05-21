public class Main {

    public static void main(String[] args) {

    }
}

/*
    try(byte[] Encrypt = Files.readAllBytes(Paths.get(Filename)){

        }


        try(FileOutputStream Output = new FileOutputStream(Filename)){



        }
        catch (FileNotFoundException ex){
            System.out.println("File " +Filename+ " not found. ");
            getFile(key);
        }
        catch (IOException e) {
            System.out.println("Error opening file...");
            getFile(key);
        }

-----------------------------------------------------------------

        Path path = Paths.get(filename);
        FileOutputStream in;
        FileOutputStream out;

        try
        {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //Create an Array to hold bytes

            byte[] BArr = Files.readAllBytes(path);
            PrintWriter encrypt = new PrintWriter(filename);

            //Display for testing the array
            for(int i = 0; i< BArr.length; i++){
                System.out.print(BArr[i]+" ");
                BArr[i] += key;
                encrypt.write(BArr[i]);
            }

            //Display the encrypted Array as Char
            System.out.println();
            for(int i = 0; i<BArr.length;i++){
                System.out.print((char) BArr[i]+" ");
            }


            //Decode the Array
            System.out.println();
            for(int i = 0; i < BArr.length; i++){
                BArr[i]-= key;
                System.out.print((char)BArr[i]+" ");
            }


           while((line = path.)) != null)
            {
                System.out.println(line);
                out = new FileOutputStream(encrypted);
            }
            bufferedReader.close();

        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Unable to open file " + filename );
        }
        catch(IOException ex)
        {
            System.out.println("Error opening file " + filename );
        }


-----------------------------------------------------------------------------------


       Scanner in = new Scanner(System.in);
       System.out.print("Enter a filename ");
       String filename = in.nextLine();
       System.out.println("Opening " + filename);

       try
       {
           FileReader fileReader = new FileReader(filename);
           BufferedReader bufferedReader = new BufferedReader(fileReader);

           while((line = bufferedReader.readLine()) != null)
           {
               System.out.println(line);
           }
           bufferedReader.close();
       }
       catch(FileNotFoundException ex)
       {
           System.out.println(
               "Unable to open file '" +
               filename + "'");
       }
       catch(IOException ex)
       {
           System.out.println(
               "Error reading file '"
               + filename + "'");
       }

 */