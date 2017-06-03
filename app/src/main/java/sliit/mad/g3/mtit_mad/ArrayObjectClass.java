package sliit.mad.g3.mtit_mad;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Rajitha Shavinda on 5/24/2017.
 */

public class ArrayObjectClass {


    Integer [] ImageNoArray;

    int[] imageRes;

    public ArrayObjectClass(Integer []A,int []R){
        ImageNoArray=A;
        imageRes=R;
    }

    public int getArr(int i) {
        return ImageNoArray[i];
    }

    public void setArr(int i) {
        this.ImageNoArray [i]= ImageNoArray[i];
    }

    public int getImageRes(int i) {
        return imageRes[i];
    }

    public void setImageRes(int i, int data) {
        imageRes[i] = data;
    }

    public void shuffleArr(){
        Collections.shuffle(Arrays.asList(ImageNoArray));
    }


}
