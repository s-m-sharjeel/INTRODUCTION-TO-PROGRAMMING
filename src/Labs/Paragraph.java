package Labs;

import java.util.*;

public class Paragraph {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Paragraph/Line: ");
        String para = input.nextLine();
        int ans;
        
        do{
            
        System.out.println("Press 1 to find and replace.");
        System.out.println("Press 2 to find no. of words.");
        System.out.println("Press 3 to find no. of sentences.");
        System.out.println("Press 4 to find no. of Articles.");
        System.out.println("Press 5 to find no. of spaces.");
        
        int answer = input.nextInt();
        
        switch(answer){
            case 1:{
                System.out.print("Please enter the word you want to replace: ");
                String replace = input.next();
                System.out.print("Please enter the word you want to fill: ");
                String fill = input.next();
                System.out.println(para.replaceAll(replace, fill));
                break;
            }
            case 2:{
                String[] words = para.split(" ");
                int wordCount = words.length;
                System.out.println("The word count is: "+wordCount);
                break;
            }
            case 3:{
                String[] sentences = para.split("\\.");
                int sentenceCount = sentences.length;
                System.out.println("The no. of sentences are: "+(sentenceCount));
                break;
            }
            case 4:{
                int articleCount=0;
                int aCount;
                int anCount;
                int theCount;
                String[] a = para.split(" a ");
                aCount = a.length;
                articleCount+=aCount;
                String[] an = para.split(" an ");
                anCount = an.length;
                articleCount+=anCount;
                String[] the = para.split(" the ");
                theCount = the.length;
                articleCount+=theCount;
                System.out.println("The no. of articles are: "+(articleCount-3));
                break;
            }
            case 5:{
                String[] space = para.split(" ");
                int spaceCount = space.length-1;
                System.out.println("The no. of spaces are: "+spaceCount);
                break;
            }
            default: System.out.println("Invalid Input");
        }
        
        System.out.println("Press 0 if you wish to continue.");
        ans = input.nextInt();
        
        input.nextLine();
        }while(ans==0);
    }
}