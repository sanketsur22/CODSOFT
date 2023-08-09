import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) throws IOException{

         String line;  
        int count = 0;  
  
        //Opens a file in read mode  
        FileReader file = new FileReader("demo.txt ");  
        BufferedReader br = new BufferedReader(file);  
        
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String word[] = line.split(" ");  
            //Counts each word  
            count = count + word.length;  
            HashMap<String, Integer> map = new HashMap<>();

            for(int i=0; i<word.length; i++){
                if(!map.containsKey(word[i])){
                    map.put(word[i],1);
                }
                else if(map.containsKey(word[i])){
                    map.put(word[i], map.get(word[i])+1);
                }
            }

            for(String x:map.keySet()){
                System.out.println(x + " " + map.get(x));
            }
        }  
        System.out.println(count);
    }
}






































/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCounter {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a option :");
        System.out.println("Press 1 to enter text");
        System.out.println("Press 2 to read file");
        int option = sc.nextInt();

        String text = "";

        if(option == 1){
            System.out.println("Enter the text: ");
            text = sc.nextLine();
        }
        else if(option == 2){
            System.out.println("enter file path");
            String filePath = sc.nextLine();
            text = readFile(filePath);  
        }
        else{
            System.out.println("Select a valid option");
            return;
        }
        
        int wordCount = countWords(text);
        System.out.println("Word count: " + wordCount);

        Map<String, Integer> wordFrequency = countWordFrequency(text);
        System.out.println("\nWord Frequency: ");
        for(Map.Entry<String, Integer> val : wordFrequency.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        private static String readFile(String filePath)throws IOException{
            StringBuilder sb = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            try{
                String line;
                while((line = reader.readLine())!=-1){
                    sb.append(line).append(str,"\n");
                }
            }
                finally{
                    reader.close();
                }
                return sb.toString();
        }

        private static int countWords(String text){
            String[] words = text.split("\\s+");
            return words.length;
        }

        private static Map<String, Integer> countWordFrequency(String text){
            String[] words = text.split("\\s+|[^\\w']+");
            Map<String, Integer> wordFrequency = new Hashmap<>();
            for(String word: words){
                if(!word.isEmpty()){
                    word = word.toLowerCase();
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, defaultValue,0) + 1);
                }
            }
            return wordFrequency;
        }
        
    }
}*/
