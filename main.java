 import java.io.*;  
class Main {  
      
      public static void main(String argv[]) {  
        try {  
          String line;  
          Process p = Runtime.getRuntime().exec  
            (new String[]{"./app","-c"});  
          BufferedReader input =  
            new BufferedReader  
              (new InputStreamReader(p.getInputStream()));  
          while ((line = input.readLine()) != null) {  
            System.out.println(line);  
          }  
          input.close();  
        }  
        catch (Exception err) {  
          err.printStackTrace();  
        }  
      }  
    }  
