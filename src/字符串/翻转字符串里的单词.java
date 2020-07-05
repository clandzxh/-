package 字符串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 翻转字符串里的单词 {
    public String reverseWords(String s){
        if (s==null||s.length()==0){
            return new String();
        }
        s=s.trim();
        String[] input=s.split(" ");
        int len=input.length;
        List<String> inputList=new ArrayList<>();
        for (int i = 0; i <len ; i++) {
            if(!input[i].equals("")) {
                inputList.add(input[i]);
            }
        }
        StringBuilder str=new StringBuilder();
        for (int i = 0; i <inputList.size(); i++) {
            str.append(inputList.get(inputList.size()-i-1));
            if(i!=inputList.size()-1) {
                str.append(" ");
            }
        }
        return str.toString();
    }
}
