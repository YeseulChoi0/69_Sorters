/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(ArrayList<String> usersData){
      super(usersData);
    }

    public void mySort(){
      for (int indexOfInsertion = 1; indexOfInsertion < elements.size(); indexOfInsertion++){
        insert1(indexOfInsertion);
        System.out.println("list: " + elements);
      }
    }

    public void insert1(int alreadyInserted){
      String valueToInsert = elements.get(alreadyInserted);
      for (int indexToCompare = alreadyInserted-1; indexToCompare >= 0; indexToCompare--){
        if (valueToInsert.compareTo(elements.get(indexToCompare)) < 0){
          shift(indexToCompare);
          if (indexToCompare == 0){
            dropValue(0, valueToInsert);
            return;
          }
        }else{
          dropValue(indexToCompare + 1, valueToInsert);
          return;
        }
      }
    }

    public void dropValue(int insertIndex, String valueToInsert){
      elements.set(insertIndex, valueToInsert);
    }

    public void shift(int shiftingIndex){
      elements.set(shiftingIndex+1, elements.get(shiftingIndex));
    }
}
