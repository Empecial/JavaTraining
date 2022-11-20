package JunitTest;

public class Copy {

    private String copyName;
    private int copyID;
    private boolean available;

    Copy(String copyName, int copyID, boolean available){

        this.copyName = copyName;

        this.copyID = copyID;

        this.available = available;
    }


    Copy getCopy(){
        return this;
    }
}
