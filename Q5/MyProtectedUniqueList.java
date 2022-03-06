package Q5;

import java.util.*;

public class MyProtectedUniqueList <T> {
   private List words;
   private String secretKey;

    public MyProtectedUniqueList(String secretKey) {
        this.words = new ArrayList<T>();
        this.secretKey = secretKey;
    }

    public List<T> getWords() {
        return this.words;
    }

    public void Add(T word){
        if (word == null || word.equals("")) {
            try {
                throw new Exception("Please Enter Valid Word");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (words.isEmpty())
            this.words.add(word);
        else {
            for (var wordInTheList : words) {
                if (word.equals(wordInTheList)) {
                    System.out.println("this word already in the list");
                    return;
                }
            }
            this.words.add(word);
        }
    }
    public void Remove(T word) {
        if (word == null || word.equals("")) {
            try {
                throw new IllegalArgumentException("Not Valid Word");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        else
            this.words.remove(word);
    }

    public void RemoveAt(int num){
        if(num<=0||num>this.words.size()){
            try {
                throw new Exception("Not Valid Number");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            words.remove(num);
        }
    }
    public void Clear(String secret){
        if(secret.equals(this.secretKey)){
            this.words.clear();
        }
        else
            try {
                throw new IllegalAccessException("NOT VALID SecretKey");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
    }

    public void Sort(String secretKey){
        if(secretKey.equals(this.secretKey)){
            Collections.sort(this.words);
        }
        else{
            try {
                throw new IllegalAccessException("NOT VALID SecretKey");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
    }
    }
}
