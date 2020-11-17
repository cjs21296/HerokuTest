package edu.mccneb;
import java.io.*;
import java.util.*;
public class Main {
    public static final File file = new File("src/main/java/edu/mccneb/WeirdFacts.txt");

    public static void main(String[] args) {
        List<String> facts = new ArrayList<>();
        Random random = new Random();
        try{
            LineNumberReader in = new LineNumberReader(new FileReader(file));
            String line=null;
            while (null != (line = in.readLine())) {
                facts.add(line);
            }
            in.close();

            while(!facts.isEmpty())
            {
                int i = random.nextInt(facts.size());
                System.out.println(facts.get(i));
                facts.remove(i);
                String cont = Console.getString("There are "+facts.size()+" facts remaining, would you like to continue?(y/n): ","y","n");
                System.out.println();
                if(cont.equals("n"))
                    break;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
