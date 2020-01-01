/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgabs_test_code;

import java.util.ArrayList;

/**
 * The FavoriteWord class implements an application that
 * simply identify the words that Bill will really like.
 * Bill's affinity for a word is determined by the number of pairs of double vowels that he has 
 * 
 * @java_version=8
 * @author ISMAIL_BOUADDI
 */
public class FavoriteWord {
    
    /*
        this function helps to find all bill's favorite words and returns a list 
        that contains one word for one test case 
        it takes for argument a list of tests wich is a list of list
    */
    public static  ArrayList<String> ListOfFavoriteWord(ArrayList<ArrayList<String>> Test){
        
        ArrayList<String> favoriteWord=new ArrayList<>();//list of bill's favorite words
        String regex="^[a-z]{1,25}$"; //regular expression for testing word
        
        if(Test.size()>10) //set maximum of multiple test cases up to 10
            return null;
        
        for(ArrayList<String> mYArray: Test){// for each test
            
            for(String string : mYArray){ // for each word in the test
                
                int r=0;
                if(string.length()<=80 && string.matches(regex)){//verify if the word given is lowercased and its length is <=80
                    for(int i=0;i<string.length()-1;i++){ // searching for pairs of double vowels on the word
                        if(string.charAt(i)==string.charAt(i+1) &&(string.charAt(i)=='a' || string.charAt(i)=='e' || 
                            string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u' || string.charAt(i)=='y' )){
                            r++;
                        }else{
                            continue;
                        }
                    }
                    
                }
                if(r==2){//if the word contains pairs of double vowels add it to list
                    favoriteWord.add(string);
                }
            }
        }
        return favoriteWord;
    }
    
    public static void main(String[] args) {
        //some test cases 
        ArrayList<String> cas1=new  ArrayList<>();
            cas1.add("beekede");cas1.add("yahoodoo");cas1.add("dedede");
        ArrayList<String> cas2=new  ArrayList<>();
            cas2.add("dedef");cas2.add("maaamaaa");cas2.add("beedeeper");
        ArrayList<String> cas3=new  ArrayList<>();
            cas2.add("yeehaaw");cas2.add("beekede");cas2.add("beekede");
        
            //pass the test cases to one group 
        ArrayList<ArrayList<String>> Test=new ArrayList<>();
            Test.add(cas1);Test.add(cas2);
            Test.add(cas3);   
            //process the tests
        ArrayList<String> myList=FavoriteWord.ListOfFavoriteWord(Test);
        
        //print favorite word for each test if it exist
        for(String string : myList)
               System.out.println(string);
    }
    
    
    
}
