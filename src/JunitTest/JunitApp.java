package JunitTest;

import java.util.ArrayList;

public class JunitApp {

    ArrayList<Integer> arrList = new ArrayList<>();



    public static void main(String[] args) {
        JunitApp main = new JunitApp();

        main.addArray(5);
    }

    void addArray(int addArrList){
        arrList.add(addArrList);
    }

    int getArrList(int index){
        return arrList.get(index);
    }


}
