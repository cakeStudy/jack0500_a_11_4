import java.util.ArrayList;

public class ch11_4a
{
    /* Write a method called partition that accepts a list of integers and an integer value E as its parameter, and rearranges
    (partitions) the list so that all the elements with values less than E occur before all elements with values greater than E.
    The exact order of the elements is unimportant, so long as all elements less than E appear before all elements greater than
    E. For example, for the linked list [15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9],
    one acceptable ordering of the list after a
    call of partition(list, 5) would be [–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9].
    You may assume that the list contains no duplicates and does not contain the element value E.*/

    public void run()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(1);
        list.add(6);
        list.add(12);
        list.add(-3);
        list.add(4);
        list.add(8);
        list.add(21);
        list.add(2);
        list.add(30);
        list.add(-1);
        list.add(9);

        System.out.println(partition(list, 5));
    }


    public ArrayList<Integer> partition(ArrayList<Integer> list, Integer E)
    {
        try
        {
            int slutIndex = list.size();
            for (int i = 0; i <= slutIndex; i++)
            {
                if (list.get(i) > E)
                {
                    //adds the integer in the back of list
                    list.add(list.get(i));

                    //remove integer form the list
                    list.remove(i);

                    //to make sure the index in list is correct
                    i--;
                    slutIndex--;
                }
            }
        }catch (IndexOutOfBoundsException IOOBe)
        {
            return list;
        }
        return list;
    }
}
